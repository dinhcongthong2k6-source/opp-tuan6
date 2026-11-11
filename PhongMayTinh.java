package thong;

public class PhongMayTinh extends PhongHoc{
	private int soMayTinh;

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}
	public boolean datChuan() {
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + " PhongMayTinh: so May Tinh= " + soMayTinh;
	}
	
}
