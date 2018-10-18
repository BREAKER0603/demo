package com.example.demo.model;

import javax.persistence.*;

@Table(name = "project_profit")
public class ProjectProfit {
    @Id
    private Integer id;

    /**
     * 项目ID
     */
    @Column(name = "poject_id")
    private Integer pojectId;

    /**
     * 国家
     */
    private String country;

    /**
     * 贸易术语
     */
    @Column(name = "trade_term")
    private String tradeTerm;

    /**
     * 项目类型
     */
    @Column(name = "project_type")
    private String projectType;

    /**
     * 合同金额（美元）
     */
    @Column(name = "contract_amount_usd")
    private Long contractAmountUsd;

    /**
     * 合同金额（人民币）
     */
    @Column(name = "contract_amount")
    private Long contractAmount;

    /**
     * 汇率
     */
    @Column(name = "exchange_rate")
    private Long exchangeRate;

    /**
     * 退税
     */
    @Column(name = "tax_refund")
    private Long taxRefund;

    /**
     * 陆运费
     */
    @Column(name = "land_freight")
    private Long landFreight;

    /**
     * 陆运险
     */
    @Column(name = "land_insurance")
    private Long landInsurance;

    /**
     * 港杂费
     */
    @Column(name = "port_charges")
    private Long portCharges;

    /**
     * 商检险
     */
    @Column(name = "inspection_fee")
    private Long inspectionFee;

    @Column(name = "international_transport")
    private Long internationalTransport;

    /**
     * 关税
     */
    private Long tariff;

    /**
     * 增值税
     */
    private Long vat;

    /**
     * 清关杂税
     */
    @Column(name = "customs_clear_fee")
    private Long customsClearFee;

    /**
     * 清关代理费
     */
    @Column(name = "customs_agent_fee")
    private Long customsAgentFee;

    /**
     * 货物运输保险
     */
    @Column(name = "transportion_insurance")
    private Long transportionInsurance;

    /**
     * 出口信用险
     */
    @Column(name = "export_credit_insurance")
    private Long exportCreditInsurance;

    /**
     * 其他信用
     */
    @Column(name = "other_credit")
    private String otherCredit;

    /**
     * 差旅费、业务费等
     */
    @Column(name = "travel_expenses")
    private Long travelExpenses;

    /**
     * 项目成本小计
     */
    @Column(name = "project_cost")
    private Long projectCost;

    /**
     * 毛利率
     */
    @Column(name = "gross_profit")
    private Long grossProfit;

    @Column(name = "agent_fee")
    private Long agentFee;

    @Column(name = "raise_fee")
    private Long raiseFee;

    /**
     * 信用证，保函费
     */
    @Column(name = "guarance_fee")
    private Long guaranceFee;

    /**
     * 融资利息
     */
    @Column(name = "financing_interest")
    private Long financingInterest;

    /**
     * 银行手续费
     */
    @Column(name = "bank_fees")
    private Long bankFees;

    /**
     * 国内税费
     */
    @Column(name = "domestic_taxs")
    private Long domesticTaxs;

    /**
     * 国外税费
     */
    @Column(name = "foreign_taxes")
    private Long foreignTaxes;

    /**
     * 管理费用
     */
    @Column(name = "manage_fee")
    private Long manageFee;

    /**
     * 市场提点后报价利润
     */
    @Column(name = "after_profit")
    private Long afterProfit;

    /**
     * 市场提点前报价利润
     */
    @Column(name = "before_profit")
    private Long beforeProfit;

    /**
     * 报价利润率
     */
    @Column(name = "quotation_profit")
    private Long quotationProfit;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取项目ID
     *
     * @return poject_id - 项目ID
     */
    public Integer getPojectId() {
        return pojectId;
    }

    /**
     * 设置项目ID
     *
     * @param pojectId 项目ID
     */
    public void setPojectId(Integer pojectId) {
        this.pojectId = pojectId;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 获取贸易术语
     *
     * @return trade_term - 贸易术语
     */
    public String getTradeTerm() {
        return tradeTerm;
    }

    /**
     * 设置贸易术语
     *
     * @param tradeTerm 贸易术语
     */
    public void setTradeTerm(String tradeTerm) {
        this.tradeTerm = tradeTerm == null ? null : tradeTerm.trim();
    }

    /**
     * 获取项目类型
     *
     * @return project_type - 项目类型
     */
    public String getProjectType() {
        return projectType;
    }

    /**
     * 设置项目类型
     *
     * @param projectType 项目类型
     */
    public void setProjectType(String projectType) {
        this.projectType = projectType == null ? null : projectType.trim();
    }

    /**
     * 获取合同金额（美元）
     *
     * @return contract_amount_usd - 合同金额（美元）
     */
    public Long getContractAmountUsd() {
        return contractAmountUsd;
    }

    /**
     * 设置合同金额（美元）
     *
     * @param contractAmountUsd 合同金额（美元）
     */
    public void setContractAmountUsd(Long contractAmountUsd) {
        this.contractAmountUsd = contractAmountUsd;
    }

    /**
     * 获取合同金额（人民币）
     *
     * @return contract_amount - 合同金额（人民币）
     */
    public Long getContractAmount() {
        return contractAmount;
    }

    /**
     * 设置合同金额（人民币）
     *
     * @param contractAmount 合同金额（人民币）
     */
    public void setContractAmount(Long contractAmount) {
        this.contractAmount = contractAmount;
    }

    /**
     * 获取汇率
     *
     * @return exchange_rate - 汇率
     */
    public Long getExchangeRate() {
        return exchangeRate;
    }

    /**
     * 设置汇率
     *
     * @param exchangeRate 汇率
     */
    public void setExchangeRate(Long exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * 获取退税
     *
     * @return tax_refund - 退税
     */
    public Long getTaxRefund() {
        return taxRefund;
    }

    /**
     * 设置退税
     *
     * @param taxRefund 退税
     */
    public void setTaxRefund(Long taxRefund) {
        this.taxRefund = taxRefund;
    }

    /**
     * 获取陆运费
     *
     * @return land_freight - 陆运费
     */
    public Long getLandFreight() {
        return landFreight;
    }

    /**
     * 设置陆运费
     *
     * @param landFreight 陆运费
     */
    public void setLandFreight(Long landFreight) {
        this.landFreight = landFreight;
    }

    /**
     * 获取陆运险
     *
     * @return land_insurance - 陆运险
     */
    public Long getLandInsurance() {
        return landInsurance;
    }

    /**
     * 设置陆运险
     *
     * @param landInsurance 陆运险
     */
    public void setLandInsurance(Long landInsurance) {
        this.landInsurance = landInsurance;
    }

    /**
     * 获取港杂费
     *
     * @return port_charges - 港杂费
     */
    public Long getPortCharges() {
        return portCharges;
    }

    /**
     * 设置港杂费
     *
     * @param portCharges 港杂费
     */
    public void setPortCharges(Long portCharges) {
        this.portCharges = portCharges;
    }

    /**
     * 获取商检险
     *
     * @return inspection_fee - 商检险
     */
    public Long getInspectionFee() {
        return inspectionFee;
    }

    /**
     * 设置商检险
     *
     * @param inspectionFee 商检险
     */
    public void setInspectionFee(Long inspectionFee) {
        this.inspectionFee = inspectionFee;
    }

    /**
     * @return international_transport
     */
    public Long getInternationalTransport() {
        return internationalTransport;
    }

    /**
     * @param internationalTransport
     */
    public void setInternationalTransport(Long internationalTransport) {
        this.internationalTransport = internationalTransport;
    }

    /**
     * 获取关税
     *
     * @return tariff - 关税
     */
    public Long getTariff() {
        return tariff;
    }

    /**
     * 设置关税
     *
     * @param tariff 关税
     */
    public void setTariff(Long tariff) {
        this.tariff = tariff;
    }

    /**
     * 获取增值税
     *
     * @return vat - 增值税
     */
    public Long getVat() {
        return vat;
    }

    /**
     * 设置增值税
     *
     * @param vat 增值税
     */
    public void setVat(Long vat) {
        this.vat = vat;
    }

    /**
     * 获取清关杂税
     *
     * @return customs_clear_fee - 清关杂税
     */
    public Long getCustomsClearFee() {
        return customsClearFee;
    }

    /**
     * 设置清关杂税
     *
     * @param customsClearFee 清关杂税
     */
    public void setCustomsClearFee(Long customsClearFee) {
        this.customsClearFee = customsClearFee;
    }

    /**
     * 获取清关代理费
     *
     * @return customs_agent_fee - 清关代理费
     */
    public Long getCustomsAgentFee() {
        return customsAgentFee;
    }

    /**
     * 设置清关代理费
     *
     * @param customsAgentFee 清关代理费
     */
    public void setCustomsAgentFee(Long customsAgentFee) {
        this.customsAgentFee = customsAgentFee;
    }

    /**
     * 获取货物运输保险
     *
     * @return transportion_insurance - 货物运输保险
     */
    public Long getTransportionInsurance() {
        return transportionInsurance;
    }

    /**
     * 设置货物运输保险
     *
     * @param transportionInsurance 货物运输保险
     */
    public void setTransportionInsurance(Long transportionInsurance) {
        this.transportionInsurance = transportionInsurance;
    }

    /**
     * 获取出口信用险
     *
     * @return export_credit_insurance - 出口信用险
     */
    public Long getExportCreditInsurance() {
        return exportCreditInsurance;
    }

    /**
     * 设置出口信用险
     *
     * @param exportCreditInsurance 出口信用险
     */
    public void setExportCreditInsurance(Long exportCreditInsurance) {
        this.exportCreditInsurance = exportCreditInsurance;
    }

    /**
     * 获取其他信用
     *
     * @return other_credit - 其他信用
     */
    public String getOtherCredit() {
        return otherCredit;
    }

    /**
     * 设置其他信用
     *
     * @param otherCredit 其他信用
     */
    public void setOtherCredit(String otherCredit) {
        this.otherCredit = otherCredit == null ? null : otherCredit.trim();
    }

    /**
     * 获取差旅费、业务费等
     *
     * @return travel_expenses - 差旅费、业务费等
     */
    public Long getTravelExpenses() {
        return travelExpenses;
    }

    /**
     * 设置差旅费、业务费等
     *
     * @param travelExpenses 差旅费、业务费等
     */
    public void setTravelExpenses(Long travelExpenses) {
        this.travelExpenses = travelExpenses;
    }

    /**
     * 获取项目成本小计
     *
     * @return project_cost - 项目成本小计
     */
    public Long getProjectCost() {
        return projectCost;
    }

    /**
     * 设置项目成本小计
     *
     * @param projectCost 项目成本小计
     */
    public void setProjectCost(Long projectCost) {
        this.projectCost = projectCost;
    }

    /**
     * 获取毛利率
     *
     * @return gross_profit - 毛利率
     */
    public Long getGrossProfit() {
        return grossProfit;
    }

    /**
     * 设置毛利率
     *
     * @param grossProfit 毛利率
     */
    public void setGrossProfit(Long grossProfit) {
        this.grossProfit = grossProfit;
    }

    /**
     * @return agent_fee
     */
    public Long getAgentFee() {
        return agentFee;
    }

    /**
     * @param agentFee
     */
    public void setAgentFee(Long agentFee) {
        this.agentFee = agentFee;
    }

    /**
     * @return raise_fee
     */
    public Long getRaiseFee() {
        return raiseFee;
    }

    /**
     * @param raiseFee
     */
    public void setRaiseFee(Long raiseFee) {
        this.raiseFee = raiseFee;
    }

    /**
     * 获取信用证，保函费
     *
     * @return guarance_fee - 信用证，保函费
     */
    public Long getGuaranceFee() {
        return guaranceFee;
    }

    /**
     * 设置信用证，保函费
     *
     * @param guaranceFee 信用证，保函费
     */
    public void setGuaranceFee(Long guaranceFee) {
        this.guaranceFee = guaranceFee;
    }

    /**
     * 获取融资利息
     *
     * @return financing_interest - 融资利息
     */
    public Long getFinancingInterest() {
        return financingInterest;
    }

    /**
     * 设置融资利息
     *
     * @param financingInterest 融资利息
     */
    public void setFinancingInterest(Long financingInterest) {
        this.financingInterest = financingInterest;
    }

    /**
     * 获取银行手续费
     *
     * @return bank_fees - 银行手续费
     */
    public Long getBankFees() {
        return bankFees;
    }

    /**
     * 设置银行手续费
     *
     * @param bankFees 银行手续费
     */
    public void setBankFees(Long bankFees) {
        this.bankFees = bankFees;
    }

    /**
     * 获取国内税费
     *
     * @return domestic_taxs - 国内税费
     */
    public Long getDomesticTaxs() {
        return domesticTaxs;
    }

    /**
     * 设置国内税费
     *
     * @param domesticTaxs 国内税费
     */
    public void setDomesticTaxs(Long domesticTaxs) {
        this.domesticTaxs = domesticTaxs;
    }

    /**
     * 获取国外税费
     *
     * @return foreign_taxes - 国外税费
     */
    public Long getForeignTaxes() {
        return foreignTaxes;
    }

    /**
     * 设置国外税费
     *
     * @param foreignTaxes 国外税费
     */
    public void setForeignTaxes(Long foreignTaxes) {
        this.foreignTaxes = foreignTaxes;
    }

    /**
     * 获取管理费用
     *
     * @return manage_fee - 管理费用
     */
    public Long getManageFee() {
        return manageFee;
    }

    /**
     * 设置管理费用
     *
     * @param manageFee 管理费用
     */
    public void setManageFee(Long manageFee) {
        this.manageFee = manageFee;
    }

    /**
     * 获取市场提点后报价利润
     *
     * @return after_profit - 市场提点后报价利润
     */
    public Long getAfterProfit() {
        return afterProfit;
    }

    /**
     * 设置市场提点后报价利润
     *
     * @param afterProfit 市场提点后报价利润
     */
    public void setAfterProfit(Long afterProfit) {
        this.afterProfit = afterProfit;
    }

    /**
     * 获取市场提点前报价利润
     *
     * @return before_profit - 市场提点前报价利润
     */
    public Long getBeforeProfit() {
        return beforeProfit;
    }

    /**
     * 设置市场提点前报价利润
     *
     * @param beforeProfit 市场提点前报价利润
     */
    public void setBeforeProfit(Long beforeProfit) {
        this.beforeProfit = beforeProfit;
    }

    /**
     * 获取报价利润率
     *
     * @return quotation_profit - 报价利润率
     */
    public Long getQuotationProfit() {
        return quotationProfit;
    }

    /**
     * 设置报价利润率
     *
     * @param quotationProfit 报价利润率
     */
    public void setQuotationProfit(Long quotationProfit) {
        this.quotationProfit = quotationProfit;
    }
}