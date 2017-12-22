package com.aci.demo.h2dbunit.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

/**
 * The persistent class for the ACS_POS_MONTHLY_CHAR database table.
 * 
 */
@Data
@Entity
@Table(schema = "ACSDBO", name = "ACS_POS_MONTHLY_CHAR")
@NamedQueries({ @NamedQuery(name = "Characteristic.find", query = "SELECT c from Characteristic c "),
				@NamedQuery(name = "Characteristic.findById", query = "SELECT c from Characteristic c where c.characteristicId like :entityId ") })
public class Characteristic
{
	@EmbeddedId
	private CharacteristicId characteristicId;

	private Double debtCapitalRo;
	private Double debtEquityRatio;

	@Column(name = "DIV_SHR_1_YR_RT")
	private Double divShr1YrRt;

	@Column(name = "DIV_SHR_3_YR_RT")
	private Double divShr3YrRt;

	@Column(name = "DIV_SHR_5_YR_RT")
	private Double divShr5YrRt;

	private Double dividendYieldPct;

	@Column(name = "EPS_FORECAST_1_YR")
	private Double epsForecast1Yr;

	@Column(name = "EPS_GROWTH_1_YR")
	private Double epsGrowth1Yr;

	@Column(name = "EPS_GROWTH_3_YR")
	private Double epsGrowth3Yr;

	@Column(name = "EPS_GROWTH_5_YR")
	private Double epsGrowth5Yr;

	private Double mktCapLargePct;
	private Double mktCapMidPct;
	private Double mktCapSmallPct;
	private Double avgMktCap;
	private Double avgWghtdMktCap;
	private Double medianMktCap;
	private Double medWghtdMktCap;
	private Double pbRatio;
	private Double peRatio;

	@Column(name = "PE_FORECAST_1_YR")
	private Double peForecast1Yr;

	@Column(name = "SURPRS_POS_EARNING")
	private Double surprsPosEarning;

	@Column(name = "SURPRS_NEG_EARNING")
	private Double surprsNegEarning;

	@Column(name = "SURPR_POS_EARN_PCT")
	private Double surprPosEarnPct;

	@Column(name = "SURPR_NEG_EARN_PCT")
	private Double surprNegEarnPct;

	@Column(name = "PRICE_CASH_FLOW_RO")
	private Double priceCashFlowRo;

	@Column(name = "PS_RATIO")
	private Double psRatio;

	@Column(name = "ROA_1_YR_RO")
	private Double roa1YrRo;

	@Column(name = "ROA_3_YR_RO")
	private Double roa3YrRo;

	@Column(name = "ROA_5_YR_RO")
	private Double roa5YrRo;

	@Column(name = "ROE_1_YR_RO")
	private Double roe1YrRo;

	@Column(name = "ROE_3_YR_RO")
	private Double roe3YrRo;

	@Column(name = "ROE_5_YR_RO")
	private Double roe5YrRo;

	@Column(name = "SPS_1_YR_RO")
	private Double sps1YrRo;

	@Column(name = "SPS_3_YR_RO")
	private Double sps3YrRo;

	@Column(name = "SPS_5_YR_RO")
	private Double sps5YrRo;

	private Double pctNonEafe;
	private Double totalCntry;
	private Double nbrEqIssue;

	@Column(name = "NBR_ISSUE_CNT")
	private Double totNbrIssue;

	@Column(name = "CF_GROWTH_1_YR_PCT")
	private Double cfGrowth1Yr;

	@Column(name = "CF_GROWTH_3_YR_PCT")
	private Double cfGrowth3Yr;

	@Column(name = "CF_GROWTH_5_YR_PCT")
	private Double cfGrowth5Yr;

	private Double divPayoutPct;

	@Column(name = "DIV_YLD_3_YR_PCT")
	private Double divYield3YrAvg;

	@Column(name = "DIV_YLD_5_YR_PCT")
	private Double divYield5YrAvg;

	@Column(name = "EPS_ESTIMATE_3_5_YR_PCT")
	private Double epsEstimate3To5Yr;

	@Column(name = "FFO_GROWTH_1_YR_PCT")
	private Double ffoGrowth1Yr;

	@Column(name = "FFO_GROWTH_3_YR_PCT")
	private Double ffoGrowth3Yr;

	@Column(name = "FFO_GROWTH_5_YR_PCT")
	private Double ffoGrowth5Yr;

	private Double grossExposure;
	private Double netExposure;
	private Double exposure;
	private Double totalIssue;
	private Double totalEqIssue;
	private Double totalFiIssue;
	private Double nbrFiIssue;
	private Double mktCapLargePctGross;
	private Double mktCapLargePctNet;
	private Double mktCapMidPctGross;
	private Double mktCapMidPctNet;
	private Double mktCapSmallPctGross;
	private Double mktCapSmallPctNet;
	private Double avgWghtdMktCapGross;
	private Double avgWghtdMktCapNet;

	@Column(name = "ACTIVE_SHARE_PCT")
	private Double activeSharesPercent;

	@Column(name = "EMERGING_MARKETS_PCT")
	private Double emergingMarketsPercent;
	
	@Column(name = "EQUITY_BETA_MEASURE")
	private Double equityBetaMeasure;
	@Column(name = "OPT_ADJUSTED_SPREAD_MEASURE")
	private Double optAdjustedSpreadMeasure;
	@Column(name = "QTR_DISCOUNT_DAY_COUNT")
	private Integer qtrDiscountDayCount;
	@Column(name = "QTR_NAV_DAY_COUNT")
	private Integer qtrNavDayCount;
	@Column(name = "QTR_PREMIUM_DAY_COUNT")
	private Integer qtrPremiumDayCount;
	@Column(name = "QTR_5PCT_NAV_DAY_COUNT")
	private Integer qtr5PctNavDayCount;
	@Column(name = "QTR_GREATEST_DISCOUNT_AMOUNT")
	private Double qtrGreatestDiscountAmount;
	@Column(name = "QTR_GREATEST_PREMIUM_AMOUNT")
	private Double qtrGreatestPremiumAmount;
	@Column(name = "QTR_5PCT_NAV_PERCENT")
	private Double qtr5PctNavPercent;

	private Integer versionId;
}
