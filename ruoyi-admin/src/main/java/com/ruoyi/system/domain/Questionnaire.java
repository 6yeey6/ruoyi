package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 调查问卷库对象 questionnaire
 * 
 * @author ruoyi
 * @date 2024-08-23
 */
public class Questionnaire extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 企业名称 */
    @Excel(name = "企业名称")
    private String companyName;

    /** 统一社会信用代码 */
//    @Excel(name = "统一社会信用代码")
    private String socialCreditCode;

    /** 所属行业 */
//    @Excel(name = "所属行业")
    private String industry;

    /** 上一年度营业收入 */
//    @Excel(name = "上一年度营业收入")
    private String priorYearIncome;

    /** 海外销售区域包括（国家） */
//    @Excel(name = "海外销售区域包括(国家)")
    private String overseasSalesArea;

    /** 分别的营业收入占比为 */
//    @Excel(name = "分别的营业收入占比为")
    private String operatingIncomeRatio;

    /** 员工人数 */
//    @Excel(name = "员工人数")
    private String employeesNumber;

    /** 联系姓名 */
    @Excel(name = "联系人姓名")
    private String contactName;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String contactMobile;

    /** 电子邮箱 */
    @Excel(name = "电子邮箱")
    private String email;

    /** 是否云服务器 */
    @Excel(name = "云服务器",readConverterExp = "0=否,1=是",combo = "否,是")
    private String cloudServer;

    /** IP地址 */
    @Excel(name = "IP地址")
    private String ip;

    /** 带宽 */
    @Excel(name = "带宽")
    private String bandwidths;

    /** 运营商 */
    @Excel(name = "运营商")
    private String operator;

    /** 是否存在网络拓扑图 */
    @Excel(name = "存在网络拓扑图",readConverterExp = "0=否,1=是",combo = "否,是")
    private String networkTopology;

    /** 附件上传地址 */
    private String networkTopologyPath;

    /** 外网区 */
    @Excel(name = "外网区",readConverterExp = "0=否,1=是",combo = "否,是")
    private String extranetArea;

    /** DMZ区 */
    @Excel(name = "DMZ区",readConverterExp = "0=否,1=是",combo = "否,是")
    private String dmzArea;

    /** 内网区 */
    @Excel(name = "内网区",readConverterExp = "0=否,1=是",combo = "否,是")
    private String intranetArea;

    /** 办公区 */
    @Excel(name = "办公区",readConverterExp = "0=否,1=是",combo = "否,是")
    private String officeArea;

    /** 运维区 */
    @Excel(name = "运维区",readConverterExp = "0=否,1=是",combo = "否,是")
    private String operationArea;

    /** 工业区 */
    @Excel(name = "工业区",readConverterExp = "0=否,1=是",combo = "否,是")
    private String industrialZone;

    /** 单位使用的IP段及其用途（例如，10.10.10段用于办公，10.10.20段用于PACS设备等） */
    @Excel(name = "单位使用的IP段及其用途(例如，10.10.10段用于办公，10.10.20段用于PACS设备等)")
    private String ipSegment;

    /** 防火墙是否存在 */
    @Excel(name = "防火墙",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isFirewalls;

    /** 防火墙品牌 */
    @Excel(name = "防火墙品牌")
    private String firewallsBrand;

    /** 防火墙上线日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "防火墙上线日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date firewallsDate;

    /** 防火墙是否在保 */
    @Excel(name = "防火墙在保",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isFirewallsInnocence;

    /** 数据库审计系统是否存在 */
    @Excel(name = "数据库审计系统存在",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isDatabaseAudits;

    /** 数据库审计系统品牌 */
    @Excel(name = "数据库审计系统品牌")
    private String databaseAuditsBrand;

    /** 数据库审计系统上线日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "数据库审计系统上线日期(yyyy-MM-dd)", width = 30, dateFormat = "yyyy-MM-dd")
    private Date databaseAuditsDate;

    /** 数据库审计系统是否在保 */
    @Excel(name = "数据库审计系统在保",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isDatabaseAuditsInnocence;

    /** 日志审计系统是否存在 */
    @Excel(name = "日志审计系统存在",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isLogAudit;

    /** 日志审计系统品牌 */
    @Excel(name = "日志审计系统品牌")
    private String logAuditBrand;

    /** 日志审计系统上线日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日志审计系统上线日期(yyyy-MM-dd)", width = 30, dateFormat = "yyyy-MM-dd")
    private Date logAuditDate;

    /** 日志审计系统是否在保 */
    @Excel(name = "日志审计系统在保",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isLogAuditInnocence;

    /** 堡垒机是否存在 */
    @Excel(name = "堡垒机存在",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isCitadel;

    /** 堡垒机品牌 */
    @Excel(name = "堡垒机品牌")
    private String citadelBrand;

    /** 堡垒机上线日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "堡垒机上线日期(yyyy-MM-dd)", width = 30, dateFormat = "yyyy-MM-dd")
    private Date citadelDate;

    /** 堡垒机是否在保 */
    @Excel(name = "堡垒机在保",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isCitadelInnocence;

    /** 态势感知是否存在 */
    @Excel(name = "态势感知存在",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isSituational;

    /** 态势感知品牌 */
    @Excel(name = "态势感知品牌")
    private String situationalBrand;

    /** 态势感知上线日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "态势感知上线日期(yyyy-MM-dd)", width = 30, dateFormat = "yyyy-MM-dd")
    private Date situationalDate;

    /** 态势感知是否在保 */
    @Excel(name = "态势感知在保",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isSituationalInnocence;

    /** WAF是否存在 */
    @Excel(name = "WAF存在",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isWaf;

    /** WAF品牌 */
    @Excel(name = "WAF品牌")
    private String wafBrand;

    /** WAF上线日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "WAF上线日期(yyyy-MM-dd)", width = 30, dateFormat = "yyyy-MM-dd")
    private Date wafDate;

    /** WAF是否在保 */
    @Excel(name = "WAF在保",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isWafInnocence;

    /** 漏洞扫描是否存在 */
    @Excel(name = "漏洞扫描存在",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isScan;

    /** 漏洞扫描品牌 */
    @Excel(name = "漏洞扫描品牌")
    private String scanBrand;

    /** 漏洞扫描上线日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "漏洞扫描上线日期(yyyy-MM-dd)", width = 30, dateFormat = "yyyy-MM-dd")
    private Date scanDate;

    /** 漏洞扫描是否在保 */
    @Excel(name = "漏洞扫描在保",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isScanInnocence;

    /** EDR是否存在 */
    @Excel(name = "EDR存在",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isEdr;

    /** EDR品牌 */
    @Excel(name = "EDR品牌")
    private String edrBrand;

    /** EDR上线日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "EDR上线日期(yyyy-MM-dd)", width = 30, dateFormat = "yyyy-MM-dd")
    private Date edrDate;

    /** EDR是否在保 */
    @Excel(name = "EDR在保",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isEdrInnocence;

    /** 蜜罐是否存在 */
    @Excel(name = "蜜罐存在",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isPrivilegedEnv;

    /** 蜜罐品牌 */
    @Excel(name = "蜜罐品牌")
    private String privilegedEnvBrand;

    /** 蜜罐上线日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "蜜罐上线日期(yyyy-MM-dd)", width = 30, dateFormat = "yyyy-MM-dd")
    private Date privilegedEnvDate;

    /** 蜜罐是否在保 */
    @Excel(name = "蜜罐在保",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isPrivilegedEnvInnocence;

    /** 网闸是否存在 */
    @Excel(name = "网闸存在",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isInternetAccess;

    /** 网闸品牌 */
    @Excel(name = "网闸品牌")
    private String internetAccessBrand;

    /** 网闸上线日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "网闸上线日期(yyyy-MM-dd)", width = 30, dateFormat = "yyyy-MM-dd")
    private Date internetAccessDate;

    /** 网闸是否在保 */
    @Excel(name = "网闸在保",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isInternetAccessInnocence;

    /** 上网行为管理设备是否存在 */
    @Excel(name = "上网行为管理设备存在",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isInternetDevice;

    /** 上网行为管理设备品牌 */
    @Excel(name = "上网行为管理设备品牌")
    private String internetDeviceBrand;

    /** 上网行为管理设备上线日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上网行为管理设备上线日期(yyyy-MM-dd)", width = 30, dateFormat = "yyyy-MM-dd")
    private Date internetDeviceDate;

    /** 上网行为管理设备是否在保 */
    @Excel(name = "上网行为管理设备在保",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isInternetDeviceInnocence;

    /** 杀毒软件是否存在 */
    @Excel(name = "杀毒软件存在")
    private String isAntiSoftware;

    /** 杀毒软件品牌 */
    @Excel(name = "杀毒软件品牌")
    private String antiSoftwareBrand;

    /** 杀毒软件上线日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "杀毒软件上线日期(yyyy-MM-dd)", width = 30, dateFormat = "yyyy-MM-dd")
    private Date antiSoftwareDate;

    /** 杀毒软件是否在保 */
    @Excel(name = "杀毒软件在保",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isAntiSoftwareInnocence;

    /** 探针是否存在 */
    @Excel(name = "探针存在")
    private String isProbes;

    /** 探针品牌 */
    @Excel(name = "探针品牌")
    private String probesBrand;

    /** 探针上线日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "探针上线日期(yyyy-MM-dd)", width = 30, dateFormat = "yyyy-MM-dd")
    private Date probesDate;

    /** 探针是否在保 */
    @Excel(name = "探针在保",readConverterExp = "0=否,1=是",combo = "否,是")
    private String isProbesInnocence;

    /** 安全设备其他（请注明） */
    @Excel(name = "安全设备其他补充")
    private String safetyOther;

    /** 请列出您所在单位现有的网络安全专业从业人员情况 */
    @Excel(name = "请列出您所在单位现有的网络安全专业从业人员情况")
    private String cyberSecurity;

    /** 请列出您所在单位现有的硬件服务器设备及用途（例如，存储服务器、计算服务器等） */
    @Excel(name = "请列出您所在单位现有的硬件服务器设备及用途(例如，存储服务器、计算服务器等)")
    private String hardwareRes;

    /** 办公系统 */
    @Excel(name = "办公系统(例如，OA办公、ERP、SAP等)")
    private String officeRes;

    /** 业务系统 */
    @Excel(name = "业务系统(例如，客户关系系统、商城系统、服务客户业务系统等)")
    private String businessRes;

    /** 辅助系统 */
    @Excel(name = "辅助系统(例如，系统维护系统、决策支持、物资管理、BI系统等)")
    private String ancillaryRes;

    /** 传呼系统 */
    @Excel(name = "对接传呼系统",readConverterExp = "0=否,1=是",combo = "否,是")
    private String pagingSystem;

    /** 短信系统 */
    @Excel(name = "对接短信系统",readConverterExp = "0=否,1=是",combo = "否,是")
    private String messageSystem;

    /** 环保系统 */
    @Excel(name = "对接环保系统",readConverterExp = "0=否,1=是",combo = "否,是")
    private String environmentalSystem;

    /** 其他外部系统 其他（请注明） */
    @Excel(name = "对接其他外部系统")
    private String externalSystemOther;

    /** 门户网站 */
    @Excel(name = "提供门户网站",readConverterExp = "0=否,1=是",combo = "否,是")
    private String webPortal;

    /** 互联网业务站点 */
    @Excel(name = "提供互联网业务站点",readConverterExp = "0=否,1=是",combo = "否,是")
    private String internetBusinessSite;

    /** 支付宝小程序 */
    @Excel(name = "提供支付宝小程序",readConverterExp = "0=否,1=是",combo = "否,是")
    private String aliPay;

    /** 微信小程序 */
    @Excel(name = "微信小程序",readConverterExp = "0=否,1=是",combo = "否,是")
    private String wechatPay;

    /** 微信公众号 */
    @Excel(name = "微信公众号",readConverterExp = "0=否,1=是",combo = "否,是")
    private String wechatPublicNumber;

    /** 外部业务系统 其他（请注明） */
    @Excel(name = "外部业务系统补充")
    private String externalSystemBusOther;

    /** 您所在单位是否提供无线局域网环境 */
    @Excel(name = "您所在单位提供无线局域网环境",readConverterExp = "0=否,1=是",combo = "否,是")
    private String unlimitedNetwork;

    /** 自助机 */
    @Excel(name = "自助机",readConverterExp = "0=否,1=是",combo = "否,是")
    private String selfServiceMachine;

    /** 扫码一体机 */
    @Excel(name = "扫码一体机",readConverterExp = "0=否,1=是",combo = "否,是")
    private String scanningMachine;

    /** PAD设备 */
    @Excel(name = "PAD设备",readConverterExp = "0=否,1=是",combo = "否,是")
    private String padDevice;

    /** 手持遥控设备 */
    @Excel(name = "手持遥控设备",readConverterExp = "0=否,1=是",combo = "否,是")
    private String handheldDevice;

    /** 辅助设备其他（请注明） */
    @Excel(name = "其他辅助设备补充")
    private String ancillaryDeviceOther;

    /** 如存在联网辅助设备，请列出具体设备名称 */
    @Excel(name = "如存在联网辅助设备，请列出具体设备名称")
    private String ancillaryDeviceOtherEre;

    /** 等保系统1名称 */
    @Excel(name = "等保系统1名称")
    private String equalProtectionSystemA;

    /** 等保等级1保护建设情况 */
    @Excel(name = "等保等级1保护建设情况")
    private String equalProtectionSystemADetail;

    /** 等保系统2名称 */
    @Excel(name = "等保系统2名称")
    private String equalProtectionSystemB;

    /** 等保等级2保护建设情况 */
    @Excel(name = "等级保护2建设情况")
    private String equalProtectionSystemBDetail;

    /** 等保系统3名称 */
    @Excel(name = "等保系统3名称")
    private String equalProtectionSystemC;

    /** 等保等级3保护建设情况 */
    @Excel(name = "等级保护3建设情况")
    private String equalProtectionSystemCDetail;

    /** 网络安全服务情况 */
    @Excel(name = "您单位是否聘请专业外部团队或内部团队定期进行网络安全相关检测，如渗透测试、代码审计、基线检查等如有，请填写:")
    private String cybersecurityServices;

    /** 网络安全情报订阅情况 */
    @Excel(name = "您单位是否订阅网络安全情报以能及时获取到最新漏洞情况如有，请填写:")
    private String cybersecurityServicesSub;

    /** 安全情况表格1 */
    @Excel(name = "是否建立安全管理制度",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo1;

    /** 安全情况表格2 */
    @Excel(name = "有专人负责IT安全",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo2;

    /** 安全情况表格3 */
    @Excel(name = "贵公司有设定不同的安全岗位职责",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo3;

    /** 安全情况表格4 */
    @Excel(name = "定期更新系统补丁",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo4;

    /** 安全情况表格5 */
    @Excel(name = "物理安全区域部署安防设备",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo5;

    /** 安全情况表格6 */
    @Excel(name = "机房有相关管控措施",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo6;

    /** 安全情况表格7 */
    @Excel(name = "清晰的管理员账户清单并且严格控制管理员权限",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo7;

    /** 安全情况表格8 */
    @Excel(name = "公司在网络边界处部署防火墙等设备",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo8;

    /** 安全情况表格9 */
    @Excel(name = "部署抗DDoS设备或云防",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo9;

    /** 安全情况表格10 */
    @Excel(name = "严格限制网络端口、通讯协议及系统服务",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo10;

    /** 安全情况表格11 */
    @Excel(name = "业务重要性或敏感性对网络进行分区管理（VLAN）",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo11;

    /** 安全情况表格12 */
    @Excel(name = "所有外部远程访问实现加密措施",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo12;

    /** 安全情况表格13 */
    @Excel(name = "信息系统安装安全防护软件",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo13;

    /** 安全情况表格14 */
    @Excel(name = "对重要业务数据进行定期备份",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo14;

    /** 安全情况表格15 */
    @Excel(name = "在终端部署软件对USB和其他外设的使用进行监控",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo15;

    /** 安全情况表格16 */
    @Excel(name = "建立人员离岗管理制度,员工离职后终止访问权限",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo16;

    /** 安全情况表格17 */
    @Excel(name = "贵公司针对安全团队有定期(每年至少1次)安全技能培训",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo17;

    /** 安全情况表格18 */
    @Excel(name = "贵公司针对全体员工有定期(每年至少1次)安全技能培训",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo18;

    /** 安全情况表格19 */
    @Excel(name = "通过相关信息安全管理体系认证(ISO 27001)(是否)",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo19;

    /** 安全情况表格20 */
    @Excel(name = "近一年内重要信息系统通过等级保护测评(是否)",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo20;

    /** 安全情况表格21 */
    @Excel(name = "电子邮件采取安全防护措施(是否)",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo21;

    /** 安全情况表格22 */
    @Excel(name = "集中监控和管理信息系统的计算和存储资源(是否)",readConverterExp = "0=否,1=是",combo = "否,是")
    private String secInfo22;

    /** 更新时间如有，请填写 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updatedTime;

    /** 客户id */
    private String userId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }
    public void setSocialCreditCode(String socialCreditCode) 
    {
        this.socialCreditCode = socialCreditCode;
    }

    public String getSocialCreditCode() 
    {
        return socialCreditCode;
    }
    public void setIndustry(String industry) 
    {
        this.industry = industry;
    }

    public String getIndustry() 
    {
        return industry;
    }
    public void setPriorYearIncome(String priorYearIncome) 
    {
        this.priorYearIncome = priorYearIncome;
    }

    public String getPriorYearIncome() 
    {
        return priorYearIncome;
    }
    public void setOverseasSalesArea(String overseasSalesArea) 
    {
        this.overseasSalesArea = overseasSalesArea;
    }

    public String getOverseasSalesArea() 
    {
        return overseasSalesArea;
    }
    public void setOperatingIncomeRatio(String operatingIncomeRatio) 
    {
        this.operatingIncomeRatio = operatingIncomeRatio;
    }

    public String getOperatingIncomeRatio() 
    {
        return operatingIncomeRatio;
    }
    public void setEmployeesNumber(String employeesNumber) 
    {
        this.employeesNumber = employeesNumber;
    }

    public String getEmployeesNumber() 
    {
        return employeesNumber;
    }
    public void setContactName(String contactName) 
    {
        this.contactName = contactName;
    }

    public String getContactName() 
    {
        return contactName;
    }
    public void setContactMobile(String contactMobile) 
    {
        this.contactMobile = contactMobile;
    }

    public String getContactMobile() 
    {
        return contactMobile;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setCloudServer(String cloudServer) 
    {
        this.cloudServer = cloudServer;
    }

    public String getCloudServer() 
    {
        return cloudServer;
    }
    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }
    public void setBandwidths(String bandwidths) 
    {
        this.bandwidths = bandwidths;
    }

    public String getBandwidths() 
    {
        return bandwidths;
    }
    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }
    public void setNetworkTopology(String networkTopology) 
    {
        this.networkTopology = networkTopology;
    }

    public String getNetworkTopology() 
    {
        return networkTopology;
    }
    public void setNetworkTopologyPath(String networkTopologyPath) 
    {
        this.networkTopologyPath = networkTopologyPath;
    }

    public String getNetworkTopologyPath() 
    {
        return networkTopologyPath;
    }
    public void setExtranetArea(String extranetArea) 
    {
        this.extranetArea = extranetArea;
    }

    public String getExtranetArea() 
    {
        return extranetArea;
    }
    public void setDmzArea(String dmzArea) 
    {
        this.dmzArea = dmzArea;
    }

    public String getDmzArea() 
    {
        return dmzArea;
    }
    public void setIntranetArea(String intranetArea) 
    {
        this.intranetArea = intranetArea;
    }

    public String getIntranetArea() 
    {
        return intranetArea;
    }
    public void setOfficeArea(String officeArea) 
    {
        this.officeArea = officeArea;
    }

    public String getOfficeArea() 
    {
        return officeArea;
    }
    public void setOperationArea(String operationArea) 
    {
        this.operationArea = operationArea;
    }

    public String getOperationArea() 
    {
        return operationArea;
    }
    public void setIndustrialZone(String industrialZone) 
    {
        this.industrialZone = industrialZone;
    }

    public String getIndustrialZone() 
    {
        return industrialZone;
    }
    public void setIpSegment(String ipSegment) 
    {
        this.ipSegment = ipSegment;
    }

    public String getIpSegment() 
    {
        return ipSegment;
    }
    public void setIsFirewalls(String isFirewalls) 
    {
        this.isFirewalls = isFirewalls;
    }

    public String getIsFirewalls() 
    {
        return isFirewalls;
    }
    public void setFirewallsBrand(String firewallsBrand) 
    {
        this.firewallsBrand = firewallsBrand;
    }

    public String getFirewallsBrand() 
    {
        return firewallsBrand;
    }
    public void setFirewallsDate(Date firewallsDate) 
    {
        this.firewallsDate = firewallsDate;
    }

    public Date getFirewallsDate() 
    {
        return firewallsDate;
    }
    public void setIsFirewallsInnocence(String isFirewallsInnocence) 
    {
        this.isFirewallsInnocence = isFirewallsInnocence;
    }

    public String getIsFirewallsInnocence() 
    {
        return isFirewallsInnocence;
    }
    public void setIsDatabaseAudits(String isDatabaseAudits) 
    {
        this.isDatabaseAudits = isDatabaseAudits;
    }

    public String getIsDatabaseAudits() 
    {
        return isDatabaseAudits;
    }
    public void setDatabaseAuditsBrand(String databaseAuditsBrand) 
    {
        this.databaseAuditsBrand = databaseAuditsBrand;
    }

    public String getDatabaseAuditsBrand() 
    {
        return databaseAuditsBrand;
    }
    public void setDatabaseAuditsDate(Date databaseAuditsDate) 
    {
        this.databaseAuditsDate = databaseAuditsDate;
    }

    public Date getDatabaseAuditsDate() 
    {
        return databaseAuditsDate;
    }
    public void setIsDatabaseAuditsInnocence(String isDatabaseAuditsInnocence) 
    {
        this.isDatabaseAuditsInnocence = isDatabaseAuditsInnocence;
    }

    public String getIsDatabaseAuditsInnocence() 
    {
        return isDatabaseAuditsInnocence;
    }
    public void setIsLogAudit(String isLogAudit) 
    {
        this.isLogAudit = isLogAudit;
    }

    public String getIsLogAudit() 
    {
        return isLogAudit;
    }
    public void setLogAuditBrand(String logAuditBrand) 
    {
        this.logAuditBrand = logAuditBrand;
    }

    public String getLogAuditBrand() 
    {
        return logAuditBrand;
    }
    public void setLogAuditDate(Date logAuditDate) 
    {
        this.logAuditDate = logAuditDate;
    }

    public Date getLogAuditDate() 
    {
        return logAuditDate;
    }
    public void setIsLogAuditInnocence(String isLogAuditInnocence) 
    {
        this.isLogAuditInnocence = isLogAuditInnocence;
    }

    public String getIsLogAuditInnocence() 
    {
        return isLogAuditInnocence;
    }
    public void setIsCitadel(String isCitadel) 
    {
        this.isCitadel = isCitadel;
    }

    public String getIsCitadel() 
    {
        return isCitadel;
    }
    public void setCitadelBrand(String citadelBrand) 
    {
        this.citadelBrand = citadelBrand;
    }

    public String getCitadelBrand() 
    {
        return citadelBrand;
    }
    public void setCitadelDate(Date citadelDate) 
    {
        this.citadelDate = citadelDate;
    }

    public Date getCitadelDate() 
    {
        return citadelDate;
    }
    public void setIsCitadelInnocence(String isCitadelInnocence) 
    {
        this.isCitadelInnocence = isCitadelInnocence;
    }

    public String getIsCitadelInnocence() 
    {
        return isCitadelInnocence;
    }
    public void setIsSituational(String isSituational) 
    {
        this.isSituational = isSituational;
    }

    public String getIsSituational() 
    {
        return isSituational;
    }
    public void setSituationalBrand(String situationalBrand) 
    {
        this.situationalBrand = situationalBrand;
    }

    public String getSituationalBrand() 
    {
        return situationalBrand;
    }
    public void setSituationalDate(Date situationalDate) 
    {
        this.situationalDate = situationalDate;
    }

    public Date getSituationalDate() 
    {
        return situationalDate;
    }
    public void setIsSituationalInnocence(String isSituationalInnocence) 
    {
        this.isSituationalInnocence = isSituationalInnocence;
    }

    public String getIsSituationalInnocence() 
    {
        return isSituationalInnocence;
    }
    public void setIsWaf(String isWaf) 
    {
        this.isWaf = isWaf;
    }

    public String getIsWaf() 
    {
        return isWaf;
    }
    public void setWafBrand(String wafBrand) 
    {
        this.wafBrand = wafBrand;
    }

    public String getWafBrand() 
    {
        return wafBrand;
    }
    public void setWafDate(Date wafDate) 
    {
        this.wafDate = wafDate;
    }

    public Date getWafDate() 
    {
        return wafDate;
    }
    public void setIsWafInnocence(String isWafInnocence) 
    {
        this.isWafInnocence = isWafInnocence;
    }

    public String getIsWafInnocence() 
    {
        return isWafInnocence;
    }
    public void setIsScan(String isScan) 
    {
        this.isScan = isScan;
    }

    public String getIsScan() 
    {
        return isScan;
    }
    public void setScanBrand(String scanBrand) 
    {
        this.scanBrand = scanBrand;
    }

    public String getScanBrand() 
    {
        return scanBrand;
    }
    public void setScanDate(Date scanDate) 
    {
        this.scanDate = scanDate;
    }

    public Date getScanDate() 
    {
        return scanDate;
    }
    public void setIsScanInnocence(String isScanInnocence) 
    {
        this.isScanInnocence = isScanInnocence;
    }

    public String getIsScanInnocence() 
    {
        return isScanInnocence;
    }
    public void setIsEdr(String isEdr) 
    {
        this.isEdr = isEdr;
    }

    public String getIsEdr() 
    {
        return isEdr;
    }
    public void setEdrBrand(String edrBrand) 
    {
        this.edrBrand = edrBrand;
    }

    public String getEdrBrand() 
    {
        return edrBrand;
    }
    public void setEdrDate(Date edrDate) 
    {
        this.edrDate = edrDate;
    }

    public Date getEdrDate() 
    {
        return edrDate;
    }
    public void setIsEdrInnocence(String isEdrInnocence) 
    {
        this.isEdrInnocence = isEdrInnocence;
    }

    public String getIsEdrInnocence() 
    {
        return isEdrInnocence;
    }
    public void setIsPrivilegedEnv(String isPrivilegedEnv) 
    {
        this.isPrivilegedEnv = isPrivilegedEnv;
    }

    public String getIsPrivilegedEnv() 
    {
        return isPrivilegedEnv;
    }
    public void setPrivilegedEnvBrand(String privilegedEnvBrand) 
    {
        this.privilegedEnvBrand = privilegedEnvBrand;
    }

    public String getPrivilegedEnvBrand() 
    {
        return privilegedEnvBrand;
    }
    public void setPrivilegedEnvDate(Date privilegedEnvDate) 
    {
        this.privilegedEnvDate = privilegedEnvDate;
    }

    public Date getPrivilegedEnvDate() 
    {
        return privilegedEnvDate;
    }
    public void setIsPrivilegedEnvInnocence(String isPrivilegedEnvInnocence) 
    {
        this.isPrivilegedEnvInnocence = isPrivilegedEnvInnocence;
    }

    public String getIsPrivilegedEnvInnocence() 
    {
        return isPrivilegedEnvInnocence;
    }
    public void setIsInternetAccess(String isInternetAccess) 
    {
        this.isInternetAccess = isInternetAccess;
    }

    public String getIsInternetAccess() 
    {
        return isInternetAccess;
    }
    public void setInternetAccessBrand(String internetAccessBrand) 
    {
        this.internetAccessBrand = internetAccessBrand;
    }

    public String getInternetAccessBrand() 
    {
        return internetAccessBrand;
    }
    public void setInternetAccessDate(Date internetAccessDate) 
    {
        this.internetAccessDate = internetAccessDate;
    }

    public Date getInternetAccessDate() 
    {
        return internetAccessDate;
    }
    public void setIsInternetAccessInnocence(String isInternetAccessInnocence) 
    {
        this.isInternetAccessInnocence = isInternetAccessInnocence;
    }

    public String getIsInternetAccessInnocence() 
    {
        return isInternetAccessInnocence;
    }
    public void setIsInternetDevice(String isInternetDevice) 
    {
        this.isInternetDevice = isInternetDevice;
    }

    public String getIsInternetDevice() 
    {
        return isInternetDevice;
    }
    public void setInternetDeviceBrand(String internetDeviceBrand) 
    {
        this.internetDeviceBrand = internetDeviceBrand;
    }

    public String getInternetDeviceBrand() 
    {
        return internetDeviceBrand;
    }
    public void setInternetDeviceDate(Date internetDeviceDate) 
    {
        this.internetDeviceDate = internetDeviceDate;
    }

    public Date getInternetDeviceDate() 
    {
        return internetDeviceDate;
    }
    public void setIsInternetDeviceInnocence(String isInternetDeviceInnocence) 
    {
        this.isInternetDeviceInnocence = isInternetDeviceInnocence;
    }

    public String getIsInternetDeviceInnocence() 
    {
        return isInternetDeviceInnocence;
    }
    public void setIsAntiSoftware(String isAntiSoftware) 
    {
        this.isAntiSoftware = isAntiSoftware;
    }

    public String getIsAntiSoftware() 
    {
        return isAntiSoftware;
    }
    public void setAntiSoftwareBrand(String antiSoftwareBrand) 
    {
        this.antiSoftwareBrand = antiSoftwareBrand;
    }

    public String getAntiSoftwareBrand() 
    {
        return antiSoftwareBrand;
    }
    public void setAntiSoftwareDate(Date antiSoftwareDate) 
    {
        this.antiSoftwareDate = antiSoftwareDate;
    }

    public Date getAntiSoftwareDate() 
    {
        return antiSoftwareDate;
    }
    public void setIsAntiSoftwareInnocence(String isAntiSoftwareInnocence) 
    {
        this.isAntiSoftwareInnocence = isAntiSoftwareInnocence;
    }

    public String getIsAntiSoftwareInnocence() 
    {
        return isAntiSoftwareInnocence;
    }
    public void setIsProbes(String isProbes) 
    {
        this.isProbes = isProbes;
    }

    public String getIsProbes() 
    {
        return isProbes;
    }
    public void setProbesBrand(String probesBrand) 
    {
        this.probesBrand = probesBrand;
    }

    public String getProbesBrand() 
    {
        return probesBrand;
    }
    public void setProbesDate(Date probesDate) 
    {
        this.probesDate = probesDate;
    }

    public Date getProbesDate() 
    {
        return probesDate;
    }
    public void setIsProbesInnocence(String isProbesInnocence) 
    {
        this.isProbesInnocence = isProbesInnocence;
    }

    public String getIsProbesInnocence() 
    {
        return isProbesInnocence;
    }
    public void setSafetyOther(String safetyOther) 
    {
        this.safetyOther = safetyOther;
    }

    public String getSafetyOther() 
    {
        return safetyOther;
    }
    public void setCyberSecurity(String cyberSecurity) 
    {
        this.cyberSecurity = cyberSecurity;
    }

    public String getCyberSecurity() 
    {
        return cyberSecurity;
    }
    public void setHardwareRes(String hardwareRes) 
    {
        this.hardwareRes = hardwareRes;
    }

    public String getHardwareRes() 
    {
        return hardwareRes;
    }
    public void setOfficeRes(String officeRes) 
    {
        this.officeRes = officeRes;
    }

    public String getOfficeRes() 
    {
        return officeRes;
    }
    public void setBusinessRes(String businessRes) 
    {
        this.businessRes = businessRes;
    }

    public String getBusinessRes() 
    {
        return businessRes;
    }
    public void setAncillaryRes(String ancillaryRes) 
    {
        this.ancillaryRes = ancillaryRes;
    }

    public String getAncillaryRes() 
    {
        return ancillaryRes;
    }
    public void setPagingSystem(String pagingSystem) 
    {
        this.pagingSystem = pagingSystem;
    }

    public String getPagingSystem() 
    {
        return pagingSystem;
    }
    public void setMessageSystem(String messageSystem) 
    {
        this.messageSystem = messageSystem;
    }

    public String getMessageSystem() 
    {
        return messageSystem;
    }
    public void setEnvironmentalSystem(String environmentalSystem) 
    {
        this.environmentalSystem = environmentalSystem;
    }

    public String getEnvironmentalSystem() 
    {
        return environmentalSystem;
    }
    public void setExternalSystemOther(String externalSystemOther) 
    {
        this.externalSystemOther = externalSystemOther;
    }

    public String getExternalSystemOther() 
    {
        return externalSystemOther;
    }
    public void setWebPortal(String webPortal) 
    {
        this.webPortal = webPortal;
    }

    public String getWebPortal() 
    {
        return webPortal;
    }
    public void setInternetBusinessSite(String internetBusinessSite) 
    {
        this.internetBusinessSite = internetBusinessSite;
    }

    public String getInternetBusinessSite() 
    {
        return internetBusinessSite;
    }
    public void setAliPay(String aliPay) 
    {
        this.aliPay = aliPay;
    }

    public String getAliPay() 
    {
        return aliPay;
    }
    public void setWechatPay(String wechatPay) 
    {
        this.wechatPay = wechatPay;
    }

    public String getWechatPay() 
    {
        return wechatPay;
    }
    public void setWechatPublicNumber(String wechatPublicNumber) 
    {
        this.wechatPublicNumber = wechatPublicNumber;
    }

    public String getWechatPublicNumber() 
    {
        return wechatPublicNumber;
    }
    public void setExternalSystemBusOther(String externalSystemBusOther) 
    {
        this.externalSystemBusOther = externalSystemBusOther;
    }

    public String getExternalSystemBusOther() 
    {
        return externalSystemBusOther;
    }
    public void setUnlimitedNetwork(String unlimitedNetwork) 
    {
        this.unlimitedNetwork = unlimitedNetwork;
    }

    public String getUnlimitedNetwork() 
    {
        return unlimitedNetwork;
    }
    public void setSelfServiceMachine(String selfServiceMachine) 
    {
        this.selfServiceMachine = selfServiceMachine;
    }

    public String getSelfServiceMachine() 
    {
        return selfServiceMachine;
    }
    public void setScanningMachine(String scanningMachine) 
    {
        this.scanningMachine = scanningMachine;
    }

    public String getScanningMachine() 
    {
        return scanningMachine;
    }
    public void setPadDevice(String padDevice) 
    {
        this.padDevice = padDevice;
    }

    public String getPadDevice() 
    {
        return padDevice;
    }
    public void setHandheldDevice(String handheldDevice) 
    {
        this.handheldDevice = handheldDevice;
    }

    public String getHandheldDevice() 
    {
        return handheldDevice;
    }
    public void setAncillaryDeviceOther(String ancillaryDeviceOther) 
    {
        this.ancillaryDeviceOther = ancillaryDeviceOther;
    }

    public String getAncillaryDeviceOther() 
    {
        return ancillaryDeviceOther;
    }
    public void setAncillaryDeviceOtherEre(String ancillaryDeviceOtherEre) 
    {
        this.ancillaryDeviceOtherEre = ancillaryDeviceOtherEre;
    }

    public String getAncillaryDeviceOtherEre() 
    {
        return ancillaryDeviceOtherEre;
    }
    public void setEqualProtectionSystemA(String equalProtectionSystemA) 
    {
        this.equalProtectionSystemA = equalProtectionSystemA;
    }

    public String getEqualProtectionSystemA() 
    {
        return equalProtectionSystemA;
    }
    public void setEqualProtectionSystemADetail(String equalProtectionSystemADetail) 
    {
        this.equalProtectionSystemADetail = equalProtectionSystemADetail;
    }

    public String getEqualProtectionSystemADetail() 
    {
        return equalProtectionSystemADetail;
    }
    public void setEqualProtectionSystemB(String equalProtectionSystemB) 
    {
        this.equalProtectionSystemB = equalProtectionSystemB;
    }

    public String getEqualProtectionSystemB() 
    {
        return equalProtectionSystemB;
    }
    public void setEqualProtectionSystemBDetail(String equalProtectionSystemBDetail) 
    {
        this.equalProtectionSystemBDetail = equalProtectionSystemBDetail;
    }

    public String getEqualProtectionSystemBDetail() 
    {
        return equalProtectionSystemBDetail;
    }
    public void setEqualProtectionSystemC(String equalProtectionSystemC) 
    {
        this.equalProtectionSystemC = equalProtectionSystemC;
    }

    public String getEqualProtectionSystemC() 
    {
        return equalProtectionSystemC;
    }
    public void setEqualProtectionSystemCDetail(String equalProtectionSystemCDetail) 
    {
        this.equalProtectionSystemCDetail = equalProtectionSystemCDetail;
    }

    public String getEqualProtectionSystemCDetail() 
    {
        return equalProtectionSystemCDetail;
    }
    public void setCybersecurityServices(String cybersecurityServices) 
    {
        this.cybersecurityServices = cybersecurityServices;
    }

    public String getCybersecurityServices() 
    {
        return cybersecurityServices;
    }
    public void setCybersecurityServicesSub(String cybersecurityServicesSub) 
    {
        this.cybersecurityServicesSub = cybersecurityServicesSub;
    }

    public String getCybersecurityServicesSub() 
    {
        return cybersecurityServicesSub;
    }
    public void setSecInfo1(String secInfo1) 
    {
        this.secInfo1 = secInfo1;
    }

    public String getSecInfo1() 
    {
        return secInfo1;
    }
    public void setSecInfo2(String secInfo2) 
    {
        this.secInfo2 = secInfo2;
    }

    public String getSecInfo2() 
    {
        return secInfo2;
    }
    public void setSecInfo3(String secInfo3) 
    {
        this.secInfo3 = secInfo3;
    }

    public String getSecInfo3() 
    {
        return secInfo3;
    }
    public void setSecInfo4(String secInfo4) 
    {
        this.secInfo4 = secInfo4;
    }

    public String getSecInfo4() 
    {
        return secInfo4;
    }
    public void setSecInfo5(String secInfo5) 
    {
        this.secInfo5 = secInfo5;
    }

    public String getSecInfo5() 
    {
        return secInfo5;
    }
    public void setSecInfo6(String secInfo6) 
    {
        this.secInfo6 = secInfo6;
    }

    public String getSecInfo6() 
    {
        return secInfo6;
    }
    public void setSecInfo7(String secInfo7) 
    {
        this.secInfo7 = secInfo7;
    }

    public String getSecInfo7() 
    {
        return secInfo7;
    }
    public void setSecInfo8(String secInfo8) 
    {
        this.secInfo8 = secInfo8;
    }

    public String getSecInfo8() 
    {
        return secInfo8;
    }
    public void setSecInfo9(String secInfo9) 
    {
        this.secInfo9 = secInfo9;
    }

    public String getSecInfo9() 
    {
        return secInfo9;
    }
    public void setSecInfo10(String secInfo10) 
    {
        this.secInfo10 = secInfo10;
    }

    public String getSecInfo10() 
    {
        return secInfo10;
    }
    public void setSecInfo11(String secInfo11) 
    {
        this.secInfo11 = secInfo11;
    }

    public String getSecInfo11() 
    {
        return secInfo11;
    }
    public void setSecInfo12(String secInfo12) 
    {
        this.secInfo12 = secInfo12;
    }

    public String getSecInfo12() 
    {
        return secInfo12;
    }
    public void setSecInfo13(String secInfo13) 
    {
        this.secInfo13 = secInfo13;
    }

    public String getSecInfo13() 
    {
        return secInfo13;
    }
    public void setSecInfo14(String secInfo14) 
    {
        this.secInfo14 = secInfo14;
    }

    public String getSecInfo14() 
    {
        return secInfo14;
    }
    public void setSecInfo15(String secInfo15) 
    {
        this.secInfo15 = secInfo15;
    }

    public String getSecInfo15() 
    {
        return secInfo15;
    }
    public void setSecInfo16(String secInfo16) 
    {
        this.secInfo16 = secInfo16;
    }

    public String getSecInfo16() 
    {
        return secInfo16;
    }
    public void setSecInfo17(String secInfo17) 
    {
        this.secInfo17 = secInfo17;
    }

    public String getSecInfo17() 
    {
        return secInfo17;
    }
    public void setSecInfo18(String secInfo18) 
    {
        this.secInfo18 = secInfo18;
    }

    public String getSecInfo18() 
    {
        return secInfo18;
    }
    public void setSecInfo19(String secInfo19) 
    {
        this.secInfo19 = secInfo19;
    }

    public String getSecInfo19() 
    {
        return secInfo19;
    }
    public void setSecInfo20(String secInfo20) 
    {
        this.secInfo20 = secInfo20;
    }

    public String getSecInfo20() 
    {
        return secInfo20;
    }
    public void setSecInfo21(String secInfo21) 
    {
        this.secInfo21 = secInfo21;
    }

    public String getSecInfo21() 
    {
        return secInfo21;
    }
    public void setSecInfo22(String secInfo22) 
    {
        this.secInfo22 = secInfo22;
    }

    public String getSecInfo22() 
    {
        return secInfo22;
    }
    public void setUpdatedTime(Date updatedTime) 
    {
        this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime() 
    {
        return updatedTime;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("companyName", getCompanyName())
            .append("socialCreditCode", getSocialCreditCode())
            .append("industry", getIndustry())
            .append("priorYearIncome", getPriorYearIncome())
            .append("overseasSalesArea", getOverseasSalesArea())
            .append("operatingIncomeRatio", getOperatingIncomeRatio())
            .append("employeesNumber", getEmployeesNumber())
            .append("contactName", getContactName())
            .append("contactMobile", getContactMobile())
            .append("email", getEmail())
            .append("cloudServer", getCloudServer())
            .append("ip", getIp())
            .append("bandwidths", getBandwidths())
            .append("operator", getOperator())
            .append("networkTopology", getNetworkTopology())
            .append("networkTopologyPath", getNetworkTopologyPath())
            .append("extranetArea", getExtranetArea())
            .append("dmzArea", getDmzArea())
            .append("intranetArea", getIntranetArea())
            .append("officeArea", getOfficeArea())
            .append("operationArea", getOperationArea())
            .append("industrialZone", getIndustrialZone())
            .append("ipSegment", getIpSegment())
            .append("isFirewalls", getIsFirewalls())
            .append("firewallsBrand", getFirewallsBrand())
            .append("firewallsDate", getFirewallsDate())
            .append("isFirewallsInnocence", getIsFirewallsInnocence())
            .append("isDatabaseAudits", getIsDatabaseAudits())
            .append("databaseAuditsBrand", getDatabaseAuditsBrand())
            .append("databaseAuditsDate", getDatabaseAuditsDate())
            .append("isDatabaseAuditsInnocence", getIsDatabaseAuditsInnocence())
            .append("isLogAudit", getIsLogAudit())
            .append("logAuditBrand", getLogAuditBrand())
            .append("logAuditDate", getLogAuditDate())
            .append("isLogAuditInnocence", getIsLogAuditInnocence())
            .append("isCitadel", getIsCitadel())
            .append("citadelBrand", getCitadelBrand())
            .append("citadelDate", getCitadelDate())
            .append("isCitadelInnocence", getIsCitadelInnocence())
            .append("isSituational", getIsSituational())
            .append("situationalBrand", getSituationalBrand())
            .append("situationalDate", getSituationalDate())
            .append("isSituationalInnocence", getIsSituationalInnocence())
            .append("isWaf", getIsWaf())
            .append("wafBrand", getWafBrand())
            .append("wafDate", getWafDate())
            .append("isWafInnocence", getIsWafInnocence())
            .append("isScan", getIsScan())
            .append("scanBrand", getScanBrand())
            .append("scanDate", getScanDate())
            .append("isScanInnocence", getIsScanInnocence())
            .append("isEdr", getIsEdr())
            .append("edrBrand", getEdrBrand())
            .append("edrDate", getEdrDate())
            .append("isEdrInnocence", getIsEdrInnocence())
            .append("isPrivilegedEnv", getIsPrivilegedEnv())
            .append("privilegedEnvBrand", getPrivilegedEnvBrand())
            .append("privilegedEnvDate", getPrivilegedEnvDate())
            .append("isPrivilegedEnvInnocence", getIsPrivilegedEnvInnocence())
            .append("isInternetAccess", getIsInternetAccess())
            .append("internetAccessBrand", getInternetAccessBrand())
            .append("internetAccessDate", getInternetAccessDate())
            .append("isInternetAccessInnocence", getIsInternetAccessInnocence())
            .append("isInternetDevice", getIsInternetDevice())
            .append("internetDeviceBrand", getInternetDeviceBrand())
            .append("internetDeviceDate", getInternetDeviceDate())
            .append("isInternetDeviceInnocence", getIsInternetDeviceInnocence())
            .append("isAntiSoftware", getIsAntiSoftware())
            .append("antiSoftwareBrand", getAntiSoftwareBrand())
            .append("antiSoftwareDate", getAntiSoftwareDate())
            .append("isAntiSoftwareInnocence", getIsAntiSoftwareInnocence())
            .append("isProbes", getIsProbes())
            .append("probesBrand", getProbesBrand())
            .append("probesDate", getProbesDate())
            .append("isProbesInnocence", getIsProbesInnocence())
            .append("safetyOther", getSafetyOther())
            .append("cyberSecurity", getCyberSecurity())
            .append("hardwareRes", getHardwareRes())
            .append("officeRes", getOfficeRes())
            .append("businessRes", getBusinessRes())
            .append("ancillaryRes", getAncillaryRes())
            .append("pagingSystem", getPagingSystem())
            .append("messageSystem", getMessageSystem())
            .append("environmentalSystem", getEnvironmentalSystem())
            .append("externalSystemOther", getExternalSystemOther())
            .append("webPortal", getWebPortal())
            .append("internetBusinessSite", getInternetBusinessSite())
            .append("aliPay", getAliPay())
            .append("wechatPay", getWechatPay())
            .append("wechatPublicNumber", getWechatPublicNumber())
            .append("externalSystemBusOther", getExternalSystemBusOther())
            .append("unlimitedNetwork", getUnlimitedNetwork())
            .append("selfServiceMachine", getSelfServiceMachine())
            .append("scanningMachine", getScanningMachine())
            .append("padDevice", getPadDevice())
            .append("handheldDevice", getHandheldDevice())
            .append("ancillaryDeviceOther", getAncillaryDeviceOther())
            .append("ancillaryDeviceOtherEre", getAncillaryDeviceOtherEre())
            .append("equalProtectionSystemA", getEqualProtectionSystemA())
            .append("equalProtectionSystemADetail", getEqualProtectionSystemADetail())
            .append("equalProtectionSystemB", getEqualProtectionSystemB())
            .append("equalProtectionSystemBDetail", getEqualProtectionSystemBDetail())
            .append("equalProtectionSystemC", getEqualProtectionSystemC())
            .append("equalProtectionSystemCDetail", getEqualProtectionSystemCDetail())
            .append("cybersecurityServices", getCybersecurityServices())
            .append("cybersecurityServicesSub", getCybersecurityServicesSub())
            .append("secInfo1", getSecInfo1())
            .append("secInfo2", getSecInfo2())
            .append("secInfo3", getSecInfo3())
            .append("secInfo4", getSecInfo4())
            .append("secInfo5", getSecInfo5())
            .append("secInfo6", getSecInfo6())
            .append("secInfo7", getSecInfo7())
            .append("secInfo8", getSecInfo8())
            .append("secInfo9", getSecInfo9())
            .append("secInfo10", getSecInfo10())
            .append("secInfo11", getSecInfo11())
            .append("secInfo12", getSecInfo12())
            .append("secInfo13", getSecInfo13())
            .append("secInfo14", getSecInfo14())
            .append("secInfo15", getSecInfo15())
            .append("secInfo16", getSecInfo16())
            .append("secInfo17", getSecInfo17())
            .append("secInfo18", getSecInfo18())
            .append("secInfo19", getSecInfo19())
            .append("secInfo20", getSecInfo20())
            .append("secInfo21", getSecInfo21())
            .append("secInfo22", getSecInfo22())
            .append("createTime", getCreateTime())
            .append("updatedTime", getUpdatedTime())
            .append("userId", getUserId())
            .toString();
    }
}
