
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.returnDetailsDTO;

import com.ailiens.optimusprime.autobots.rest.dto.NeftDetailsDTO;
import com.ailiens.optimusprime.autobots.rest.dto.RefundModesDTO;
import com.ailiens.optimusprime.autobots.rest.dto.VoucherDetailsDTO;
import com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.historyDTO.ReturnsHistory;
import com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.orderDetails.AccountsDetailsDTO;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class ReturnDetailsDTO {

    private String returnId;
    private String orderId;
    private String consignmentId;
    private String returnInitiatedDate;
    private String returnCancellationSLA;
    private String qualityBucket;
    private ReturnPricingDetails returnPricingDetails;
    private ReturnType returnType;
    private String neft;
    private RefundStatus refundStatus;
    private FfCenterDTO ffCenter;
    private AddressDetailsDTO addressDetails;
    private ReturnStatus returnStatus;
    private ReturnMode returnMode;
    private RefundPaymentSummary refundPaymentSummary;
    private AccountsDetailsDTO CustomerDetails;
    private List<RefundPaymentDetail> refundPaymentDetails = new ArrayList<RefundPaymentDetail>();
    private ItemDTO item;
    private String returnConsignmentStatus;
    private RefundModesDTO refundModes;
    private NeftDetailsDTO neftDetails;
    private VoucherDetailsDTO voucherDetails;
    public List<ReturnsHistory> returnHistory = new ArrayList<ReturnsHistory>();

    public ReturnDetailsDTO() {
        super();
    }

    /**
     *
     * @return
     *     The returnId
     */
    public String getReturnId() {
        return returnId;
    }

    /**
     *
     * @param returnId
     *     The returnId
     */
    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    /**
     *
     * @return
     *     The orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     *
     * @param orderId
     *     The orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     *
     * @return
     *     The returnInitiatedDate
     */
    public String getReturnInitiatedDate() {
        return returnInitiatedDate;
    }

    /**
     *
     * @param returnInitiatedDate
     *     The returnInitiatedDate
     */
    public void setReturnInitiatedDate(String returnInitiatedDate) {
        this.returnInitiatedDate = returnInitiatedDate;
    }

    /**
     *
     * @return
     *     The returnCancellationSLA
     */
    public String getReturnCancellationSLA() {
        return returnCancellationSLA;
    }

    /**
     *
     * @param returnCancellationSLA
     *     The returnCancellationSLA
     */
    public void setReturnCancellationSLA(String returnCancellationSLA) {
        this.returnCancellationSLA = returnCancellationSLA;
    }



    public String getQualityBucket() {
		return qualityBucket;
	}

	public void setQualityBucket(String qualityBucket) {
		this.qualityBucket = qualityBucket;
	}

	/**
     *
     * @return
     *     The returnPricingDetails
     */
    public ReturnPricingDetails getReturnPricingDetails() {
        return returnPricingDetails;
    }

    /**
     *
     * @param returnPricingDetails
     *     The returnPricingDetails
     */
    public void setReturnPricingDetails(ReturnPricingDetails returnPricingDetails) {
        this.returnPricingDetails = returnPricingDetails;
    }

    /**
     *
     * @return
     *     The returnType
     */
    public ReturnType getReturnType() {
        return returnType;
    }

    /**
     *
     * @param returnType
     *     The returnType
     */
    public void setReturnType(ReturnType returnType) {
        this.returnType = returnType;
    }

    /**
     *
     * @return
     *     The neft
     */
    public String getNeft() {
        return neft;
    }

    /**
     *
     * @param neft
     *     The neft
     */
    public void setNeft(String neft) {
        this.neft = neft;
    }

    /**
     *
     * @return
     *     The refundStatus
     */
    public RefundStatus getRefundStatus() {
        return refundStatus;
    }

    /**
     *
     * @param refundStatus
     *     The refundStatus
     */
    public void setRefundStatus(RefundStatus refundStatus) {
        this.refundStatus = refundStatus;
    }

    /**
     *
     * @return
     *     The ffCenter
     */
    public FfCenterDTO getFfCenter() {
        return ffCenter;
    }

    /**
     *
     * @param ffCenter
     *     The ffCenter
     */
    public void setFfCenter(FfCenterDTO ffCenter) {
        this.ffCenter = ffCenter;
    }

    /**
     *
     * @return
     *     The addressDetails
     */
    public AddressDetailsDTO getAddressDetails() {
        return addressDetails;
    }

    /**
     *
     * @param addressDetails
     *     The addressDetails
     */
    public void setAddressDetails(AddressDetailsDTO addressDetails) {
        this.addressDetails = addressDetails;
    }

    /**
     *
     * @return
     *     The returnStatus
     */
    public ReturnStatus getReturnStatus() {
        return returnStatus;
    }

    /**
     *
     * @param returnStatus
     *     The returnStatus
     */
    public void setReturnStatus(ReturnStatus returnStatus) {
        this.returnStatus = returnStatus;
    }

    /**
     *
     * @return
     *     The returnMode
     */
    public ReturnMode getReturnMode() {
        return returnMode;
    }

    /**
     *
     * @param returnMode
     *     The returnMode
     */
    public void setReturnMode(ReturnMode returnMode) {
        this.returnMode = returnMode;
    }

    /**
     *
     * @return
     *     The refundPaymentSummary
     */
    public RefundPaymentSummary getRefundPaymentSummary() {
        return refundPaymentSummary;
    }

    /**
     *
     * @param refundPaymentSummary
     *     The refundPaymentSummary
     */
    public void setRefundPaymentSummary(RefundPaymentSummary refundPaymentSummary) {
        this.refundPaymentSummary = refundPaymentSummary;
    }

    /**
     *
     * @return
     *     The refundPaymentDetails
     */
    public List<RefundPaymentDetail> getRefundPaymentDetails() {
        return refundPaymentDetails;
    }

    /**
     *
     * @param refundPaymentDetails
     *     The refundPaymentDetails
     */
    public void setRefundPaymentDetails(List<RefundPaymentDetail> refundPaymentDetails) {
        this.refundPaymentDetails = refundPaymentDetails;
    }

    public NeftDetailsDTO getNeftDetails() {
        return neftDetails;
    }

    public void setNeftDetails(NeftDetailsDTO neftDetails) {
        this.neftDetails = neftDetails;
    }

    public ItemDTO getItem() {
		return item;
	}

	public void setItem(ItemDTO item) {
		this.item = item;
	}

    public AccountsDetailsDTO getCustomerDetails() {
        return CustomerDetails;
    }

    public void setCustomerDetails(AccountsDetailsDTO customerDetails) {
        CustomerDetails = customerDetails;
    }

    public List<ReturnsHistory> getReturnHistory() {
		return returnHistory;
	}

	public void setReturnHistory(List<ReturnsHistory> returnHistory) {
		this.returnHistory = returnHistory;
	}

    public String getReturnConsignmentStatus() {
        return returnConsignmentStatus;
    }

    public void setReturnConsignmentStatus(String returnConsignmentStatus) {
        this.returnConsignmentStatus = returnConsignmentStatus;
    }

    public VoucherDetailsDTO getVoucherDetails() {
        return voucherDetails;
    }

    public void setVoucherDetails(VoucherDetailsDTO voucherDetails) {
        this.voucherDetails = voucherDetails;
    }

    public RefundModesDTO getRefundModes() {
        return refundModes;
    }

    public void setRefundModes(RefundModesDTO refundModes) {
        this.refundModes = refundModes;
    }

    public String getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(String consignmentId) {
        this.consignmentId = consignmentId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
