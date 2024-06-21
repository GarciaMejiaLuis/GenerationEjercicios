package org.clase;

public class Consultor implements Pagable {
	private String RFC;
	private double CostoHora;
	private String razonSocial;
	public String getRFC() {
		return RFC;
	}
	public void setRFC(String rFC) {
		RFC = rFC;
	}
	public double getCostoHora() {
		return CostoHora;
	}
	public void setCostoHora(double costoHora) {
		CostoHora = costoHora;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public Consultor( String razonSocial,String rFC, double costoHora) {
		RFC = rFC;
		CostoHora = costoHora;
		this.razonSocial = razonSocial;
	}
	
	
	
	@Override
	public String getName() {
		return getRazonSocial();
	}
	@Override
	public String getRfc() {
		// TODO Auto-generated method stub
		return getRFC();
	}
	@Override
	public String getDepartment() {
		return "Externo";
	}
	@Override
	public String calculateSalary(int days) {
		return String.format("%.2f",( (this.CostoHora*8)*days)*1.16);
	}
	@Override
	public int getId() {
		return 10000;
	}
}
