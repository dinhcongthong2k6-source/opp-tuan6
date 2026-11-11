package thong;

public class PhongThiNghiem extends PhongHoc{
	private String thongTinChuyenNganh;
	private int sucChua;
	private boolean bonRua;
	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String thongTinChuyenNganh,
			int sucChua, boolean bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.thongTinChuyenNganh = thongTinChuyenNganh;
		this.sucChua = sucChua;
		this.bonRua = bonRua;
	}
	public String getThongTinChuyenNganh() {
		return thongTinChuyenNganh;
	}
	public void setThongTinChuyenNganh(String thongTinChuyenNganh) {
		this.thongTinChuyenNganh = thongTinChuyenNganh;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public boolean isBonRua() {
		return bonRua;
	}
	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}
	@Override
	public String toString() {
		return super.toString() + " PhongThiNghiem: thong Tin Chuyen Nganh: " + thongTinChuyenNganh + ", suc Chua= " + sucChua + ", bon Rua: "
				+ (bonRua ?"Co":"Khong");
	}
	@Override
	public boolean datChuan() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}
