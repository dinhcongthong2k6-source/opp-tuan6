package thong;

public class PhongLiThuyet extends PhongHoc{
	private boolean mayChieu;

	public PhongLiThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}

	public boolean isMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}
	public boolean datChuan() {
		return true;
	}
	@Override
	public String toString() {
		return super.toString() +" PhongLiThuyet: may Chieu: " + (mayChieu?"Co":"khong");
	}
	
	
}
