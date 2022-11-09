package com.rarjavademo.tables.dto;

import com.rarjavademo.tables.model.ClientdataModel;

public class ClientdataDto {
	 private Long id;
		private Long clientcode;
	    private String clientname;
	    private Long taxfederal;
	    private String clientlocation;
	    private String agreementstartdate;
	    private String serviceagreementonboarded;
	    private String agreementenddate;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getClientcode() {
			return clientcode;
		}
		public void setClientcode(Long clientcode) {
			this.clientcode = clientcode;
		}
		public String getClientname() {
			return clientname;
		}
		public void setClientname(String clientname) {
			this.clientname = clientname;
		}
		public Long getTaxfederal() {
			return taxfederal;
		}
		public void setTaxfederal(Long taxfederal) {
			this.taxfederal = taxfederal;
		}
		public String getClientlocation() {
			return clientlocation;
		}
		public void setClientlocation(String clientlocation) {
			this.clientlocation = clientlocation;
		}
		public String getAgreementstartdate() {
			return agreementstartdate;
		}
		public void setAgreementstartdate(String agreementstartdate) {
			this.agreementstartdate = agreementstartdate;
		}
		public String getServiceagreementonboarded() {
			return serviceagreementonboarded;
		}
		public void setServiceagreementonboarded(String serviceagreementonboarded) {
			this.serviceagreementonboarded = serviceagreementonboarded;
		}
		public String getAgreementenddate() {
			return agreementenddate;
		}
		public void setAgreementenddate(String agreementenddate) {
			this.agreementenddate = agreementenddate;
		}
		
		public static ClientdataDto getClientDto(ClientdataModel i) {

	        ClientdataDto cdto = new ClientdataDto();
	        cdto.setId(i.getId());
	        cdto.setClientcode(i.getClientcode());
	        cdto.setClientname(i.getClientname());
	        cdto.setTaxfederal(i.getTaxfederal());
	        cdto.setClientlocation(i.getClientlocation());
	        cdto.setAgreementstartdate(i.getAgreementstartdate());
	        cdto.setServiceagreementonboarded(i.getServiceagreementonboarded());
	        cdto.setAgreementenddate(i.getAgreementenddate());
	        return cdto;
	    }
}
