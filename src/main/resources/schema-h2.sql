----------------------------------------------------------
----  DDL for Table ACSDBO.ACS_POS_MONTHLY_CHAR
----------------------------------------------------------
CREATE TABLE ACSDBO.ACS_POS_MONTHLY_CHAR 
   (ENTITY_ID CHAR(8), 
	EFFECTIVE_DATE DATE, 
	POSITION_ID NUMBER, 
	DEBT_CAPITAL_RO NUMBER(28,9), 
	DEBT_EQUITY_RATIO NUMBER(28,9), 
	DIV_SHR_1_YR_RT NUMBER(28,9), 
	DIV_SHR_3_YR_RT NUMBER(28,9), 
	DIV_SHR_5_YR_RT NUMBER(28,9), 
	DIVIDEND_YIELD_PCT NUMBER(28,9), 
	EPS_FORECAST_1_YR NUMBER(28,9), 
	EPS_GROWTH_1_YR NUMBER(28,9), 
	EPS_GROWTH_3_YR NUMBER(28,9), 
	EPS_GROWTH_5_YR NUMBER(28,9), 
	MKT_CAP_LARGE_PCT NUMBER(28,9), 
	MKT_CAP_MID_PCT NUMBER(28,9), 
	MKT_CAP_SMALL_PCT NUMBER(28,9), 
	AVG_MKT_CAP NUMBER(28,9), 
	MEDIAN_MKT_CAP NUMBER(28,9), 
	AVG_WGHTD_MKT_CAP NUMBER(28,9), 
	MED_WGHTD_MKT_CAP NUMBER(28,9), 
	PB_RATIO NUMBER(28,9), 
	PE_RATIO NUMBER(28,9), 
	PE_FORECAST_1_YR NUMBER(28,9), 
	SURPRS_POS_EARNING NUMBER(28,9), 
	SURPRS_NEG_EARNING NUMBER(28,9), 
	SURPR_POS_EARN_PCT NUMBER(28,9), 
	SURPR_NEG_EARN_PCT NUMBER(28,9), 
	PRICE_CASH_FLOW_RO NUMBER(28,9), 
	PS_RATIO NUMBER(28,9), 
	ROA_1_YR_RO NUMBER(28,9), 
	ROA_3_YR_RO NUMBER(28,9), 
	ROA_5_YR_RO NUMBER(28,9), 
	ROE_1_YR_RO NUMBER(28,9), 
	ROE_3_YR_RO NUMBER(28,9), 
	ROE_5_YR_RO NUMBER(28,9), 
	SPS_1_YR_RO NUMBER(28,9), 
	SPS_3_YR_RO NUMBER(28,9), 
	SPS_5_YR_RO NUMBER(28,9), 
	PCT_NON_EAFE NUMBER(28,9), 
	TOTAL_CNTRY NUMBER(5,0), 
	NBR_EQ_ISSUE NUMBER(9,0), 
	LAST_UPDATE_BY CHAR(8), 
	LAST_UPDATE_TS DATE, 
	LONG_SHORT_IND CHAR(1), 
	NBR_ISSUE_CNT NUMBER(9,0), 
	CF_GROWTH_1_YR_PCT NUMBER(28,9), 
	CF_GROWTH_3_YR_PCT NUMBER(28,9), 
	CF_GROWTH_5_YR_PCT NUMBER(28,9), 
	DIV_PAYOUT_PCT NUMBER(28,9), 
	DIV_YLD_3_YR_PCT NUMBER(28,9), 
	DIV_YLD_5_YR_PCT NUMBER(28,9), 
	EPS_ESTIMATE_3_5_YR_PCT NUMBER(28,9), 
	FFO_GROWTH_1_YR_PCT NUMBER(28,9), 
	FFO_GROWTH_3_YR_PCT NUMBER(28,9), 
	FFO_GROWTH_5_YR_PCT NUMBER(28,9), 
	VERSION_ID NUMBER(5,0), 
	PORTFOLIO_CURCODE CHAR(5), 
	ENTITY_NAME CHAR(15), 
	GROSS_EXPOSURE NUMBER(28,9), 
	NET_EXPOSURE NUMBER(28,9), 
	EXPOSURE NUMBER(28,9), 
	TOTAL_ISSUE NUMBER(9,0), 
	TOTAL_EQ_ISSUE NUMBER(9,0), 
	TOTAL_FI_ISSUE NUMBER(9,0), 
	NBR_FI_ISSUE NUMBER(9,0), 
	MKT_CAP_LARGE_PCT_GROSS NUMBER(28,9), 
	MKT_CAP_LARGE_PCT_NET NUMBER(28,9), 
	MKT_CAP_MID_PCT_GROSS NUMBER(28,9), 
	MKT_CAP_MID_PCT_NET NUMBER(28,9), 
	MKT_CAP_SMALL_PCT_GROSS NUMBER(28,9), 
	MKT_CAP_SMALL_PCT_NET NUMBER(28,9), 
	AVG_WGHTD_MKT_CAP_GROSS NUMBER(28,9), 
	AVG_WGHTD_MKT_CAP_NET NUMBER(28,9), 
	ACTIVE_SHARE_PCT NUMBER(12,6), 
	EMERGING_MARKETS_PCT NUMBER(12,6), 
	EQUITY_BETA_MEASURE NUMBER(28,9), 
	OPT_ADJUSTED_SPREAD_MEASURE NUMBER(28,9), 
	QTR_DISCOUNT_DAY_COUNT NUMBER(9,0), 
	QTR_NAV_DAY_COUNT NUMBER(9,0), 
	QTR_PREMIUM_DAY_COUNT NUMBER(9,0), 
	QTR_5PCT_NAV_DAY_COUNT NUMBER(9,0), 
	QTR_GREATEST_DISCOUNT_AMOUNT NUMBER(28,9), 
	QTR_GREATEST_PREMIUM_AMOUNT NUMBER(28,9), 
	QTR_5PCT_NAV_PERCENT NUMBER(28,9)
   );
  
--------------------------------------------------------
--  DDL for Table ACSDBO.ACS_POS_MONTHLY_MPT_STATS
--------------------------------------------------------

  CREATE TABLE ACSDBO.ACS_POS_MONTHLY_MPT_STATS 
   (ENTITY_ID CHAR(8), 
	EFFECTIVE_DATE DATE, 
	STAT_TYPE VARCHAR2(20), 
	ENTITY_BMRK_RELATION_TYPE VARCHAR2(20), 
	BMRK_ENTITY_ID CHAR(8), 
	SRC_INTFC_INST NUMBER(38,0), 
	ALPHA_1_YR_PCT NUMBER(28,12), 
	ALPHA_3_YR_PCT NUMBER(28,12), 
	ALPHA_5_YR_PCT NUMBER(28,12), 
	ALPHA_10_YR_PCT NUMBER(28,12), 
	ALPHA_ITD_PCT NUMBER(28,12), 
	BETA_1_YR_NBR NUMBER(28,12), 
	BETA_3_YR_NBR NUMBER(28,12), 
	BETA_5_YR_NBR NUMBER(28,12), 
	BETA_10_YR_NBR NUMBER(28,12), 
	BETA_ITD_NBR NUMBER(28,12), 
	INFO_RO_1_YR_NBR NUMBER(28,12), 
	INFO_RO_3_YR_NBR NUMBER(28,12), 
	INFO_RO_5_YR_NBR NUMBER(28,12), 
	INFO_RO_10_YR_NBR NUMBER(28,12), 
	INFO_RO_ITD_NBR NUMBER(28,12), 
	R2_1_YR_PCT NUMBER(28,12), 
	R2_3_YR_PCT NUMBER(28,12), 
	R2_5_YR_PCT NUMBER(28,12), 
	R2_10_YR_PCT NUMBER(28,12), 
	R2_ITD_PCT NUMBER(28,12), 
	SHARPE_RO_1_YR_NBR NUMBER(28,12), 
	SHARPE_RO_3_YR_NBR NUMBER(28,12), 
	SHARPE_RO_5_YR_NBR NUMBER(28,12), 
	SHARP_RO_10_YR_NBR NUMBER(28,12), 
	SHARP_RO_ITD_NBR NUMBER(28,12), 
	STD_DEV_1_YR_PCT NUMBER(28,12), 
	STD_DEV_3_YR_PCT NUMBER(28,12), 
	STD_DEV_5_YR_PCT NUMBER(28,12), 
	STD_DEV_10_YR_PCT NUMBER(28,12), 
	STD_DEV_ITD_PCT NUMBER(28,12), 
	TRACKING_1_YR_PCT NUMBER(28,12), 
	TRACKING_3_YR_PCT NUMBER(28,12), 
	TRACKING_5_YR_PCT NUMBER(28,12), 
	TRACKING_10_YR_PCT NUMBER(28,12), 
	TRACKING_ITD_PCT NUMBER(28,12), 
	LAST_UPDATE_BY VARCHAR2(30), 
	LAST_UPDATE_TS DATE, 
	STATUS_CD CHAR(1)
   );

----------------------------------------------------------
----  DDL for Table ACSDBO.ACS_POS_TURNOVER
----------------------------------------------------------

  CREATE TABLE ACSDBO.ACS_POS_TURNOVER 
   (ENTITY_ID CHAR(8), 
	EFFECTIVE_DATE DATE, 
	POSITION_ID NUMBER, 
	FREQUENCY CHAR(1), 
	TURNOVER_PCT NUMBER(9,0), 
	TURNOVER_PCT_AVG NUMBER(9,0), 
	LAST_UPDATE_BY CHAR(8), 
	LAST_UPDATE_TS TIMESTAMP (0)
   );

--------------------------------------------------------
--  DDL for Table PACE_MASTERDBO.BUSINESS_CALENDAR
--------------------------------------------------------

  CREATE TABLE PACE_MASTERDBO.BUSINESS_CALENDAR 
   (SRC_INTFC_INST NUMBER, 
	BUSINESS_DATE DATE, 
	MONTH_END_FLAG NUMBER, 
	QTR_END_FLAG NUMBER, 
	YEAR_END_FLAG NUMBER, 
	WEEK_END_FLAG NUMBER, 
	CURR_BUSINESS_DAY CHAR(2), 
	DAILY_FLAG NUMBER, 
	UPDATE_SOURCE VARCHAR2(50), 
	UPDATE_DATE DATE DEFAULT SYSDATE
   );