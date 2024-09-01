package com.ruoyi.system.util;

import cn.afterturn.easypoi.word.WordExportUtil;
import com.ruoyi.common.config.RuoYiConfig;
import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.util.Assert;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * @description Word相关处理
 */
public class WordUtils {

    /**
     * EasyPoi 替换数据 导出 word
     *
     * @param templatePath word模板地址
     * @param tempDir      临时文件存放地址
     * @param wordFilename 文件名称
     * @param data         替换参数
     * @param isPdf        是否导出pdf
     * @param request
     * @param response
     */
    public static String easyPoiExport(String templatePath, String tempDir, String wordFilename, Map<String, Object> data, HttpServletRequest request, HttpServletResponse response, boolean isPdf) {
        Assert.notNull(templatePath, "模板路径不能为空");
        Assert.notNull(tempDir, "临时文件路径不能为空");
        Assert.notNull(wordFilename, "文件名称不能为空");
        Assert.isTrue(wordFilename.endsWith(".docx"), "文件名称仅支持docx格式");

        if (!tempDir.endsWith("/")) {
            tempDir = tempDir + File.separator;
        }

        File file = new File(tempDir);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            String userAgent = request.getHeader("user-agent").toLowerCase();
            if (userAgent.contains("msie") || userAgent.contains("like gecko")) {
//                wordFilename = URLEncoder.encode(wordFilename, "UTF-8");
                wordFilename = wordFilename;
            } else {
                wordFilename = new String(wordFilename.getBytes("utf-8"), "ISO-8859-1");
            }

            XWPFDocument document = WordExportUtil.exportWord07(templatePath, data);
            //TODO 转换为pdf
            if (isPdf) {
                wordFilename = docConvertPdf(document);
            } else {
                String tempPath = tempDir + wordFilename;
                FileOutputStream out = new FileOutputStream(tempPath);
                document.write(out);
                out.flush();
                out.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return wordFilename;
    }

    /**
     * 删除临时生成的文件
     */
    public static void deleteTempFile(String filePath, String fileName) {
        File file = new File(filePath + fileName);
        File f = new File(filePath);
        file.delete();
        f.delete();
    }

    /**
     * doc转pdf
     *
     * @param xwpfDocument
     * @return
     * @throws IOException
     */
    public static String docConvertPdf(XWPFDocument xwpfDocument) throws IOException {
        PdfOptions pdfOptions = PdfOptions.create();
        String realFileName = System.currentTimeMillis() + "export.pdf";
//    String path = RuoYiConfig.getDownloadPath() + realFileName;
        String path = RuoYiConfig.getProfile() + "/download/" + realFileName;
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        PdfConverter.getInstance().convert(xwpfDocument, fileOutputStream, pdfOptions);
        fileOutputStream.flush();
        fileOutputStream.close();
        return realFileName;
    }
}