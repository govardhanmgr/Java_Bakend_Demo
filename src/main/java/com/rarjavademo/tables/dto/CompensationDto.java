package com.rarjavademo.tables.dto;
import com.rarjavademo.tables.model.CompensationModel;
import com.rarjavademo.tables.model.ExpensesModel;


public class CompensationDto {
    private Long id;
    private Long employeeid;
    private String comment;
    private String changereason;
    private String overtimerate;
    private String overtime;
    private String payrate;
    private String paytype;
    private String payschedule;
    private String compensationeffectivedate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Long employeeid) {
		this.employeeid = employeeid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getChangereason() {
		return changereason;
	}
	public void setChangereason(String changereason) {
		this.changereason = changereason;
	}
	public String getOvertimerate() {
		return overtimerate;
	}
	public void setOvertimerate(String overtimerate) {
		this.overtimerate = overtimerate;
	}
	public String getOvertime() {
		return overtime;
	}
	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}
	public String getPayrate() {
		return payrate;
	}
	public void setPayrate(String payrate) {
		this.payrate = payrate;
	}
	public String getPaytype() {
		return paytype;
	}
	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
	public String getPayschedule() {
		return payschedule;
	}
	public void setPayschedule(String payschedule) {
		this.payschedule = payschedule;
	}
	public String getCompensationeffectivedate() {
		return compensationeffectivedate;
	}
	public void setCompensationeffectivedate(String compensationeffectivedate) {
		this.compensationeffectivedate = compensationeffectivedate;
	}

	public static CompensationDto getDto(CompensationModel i){
    	CompensationDto edt= new CompensationDto();
        edt.setId(i.getId());
        edt.setEmployeeid(i.getEmployeeid());
        edt.setComment(i.getComment());
        edt.setChangereason(i.getChangereason());
        edt.setOvertimerate(i.getOvertimerate());
        edt.setOvertime(i.getOvertime());
        edt.setPayrate(i.getPayrate());
        edt.setPaytype(i.getPayrate());
        edt.setPayschedule(i.getPayrate());
        edt.setCompensationeffectivedate(i.getCompensationeffectivedate());
       
        return edt;
    

	}
}
