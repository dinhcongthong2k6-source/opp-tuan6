package thong;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListPhongHoc {
	List<PhongHoc> dsph;
	public ListPhongHoc() {
		dsph=new ArrayList<PhongHoc>();
	}
	public boolean themPH(PhongHoc ph) {
		for (PhongHoc phongHoc : dsph) {
			if(phongHoc.getMaPhong().equalsIgnoreCase(ph.getMaPhong())) {
				
				return false;
			}
		}
		dsph.add(ph);
		return true;
	}
	public boolean timKiemTheoMa(String ma) {
		for (PhongHoc phongHoc : dsph) {
			if(phongHoc.getMaPhong().equalsIgnoreCase(ma)) {
				return true;
			}
		}
		return false;
	}
	public void xuatDSPhongHoc() {
		for (PhongHoc phongHoc : dsph) {
			System.out.println(phongHoc);
		}
	}
	public ArrayList<PhongHoc> getPhongHocDatChuan() {
        ArrayList<PhongHoc> kq = new ArrayList<>();

        for (PhongHoc p : dsph) {
            if (p.datChuan()) {
                kq.add(p);
            }
        }
        return kq;
    }

    // 3. Sắp xếp tăng dần theo dãy nhà
    public void sapXepTangTheoDayNha() {
        dsph.sort(
            Comparator.comparing(PhongHoc::getDayNha)
        );
    }

    // 4. Sắp xếp giảm dần theo diện tích
    public void sapXepGiamTheoDienTich() {
        dsph.sort(
            Comparator.comparingDouble(PhongHoc::getDienTich)
                      .reversed()
        );
    }

    // 5. Sắp xếp tăng dần theo số bóng đèn
    public void sapXepTangTheoSoBongDen() {
        dsph.sort(
            Comparator.comparingInt(PhongHoc::getSoBongDen)
        );
    }

    public boolean capNhatSoMayTinh(String maPhong, int soMayTinh) {
        if (soMayTinh < 0) {
            return false;
        }

        for (PhongHoc p : dsph) {
            if (p instanceof PhongMayTinh
                    && p.getMaPhong().equalsIgnoreCase(maPhong)) {
                ((PhongMayTinh) p).setSoMayTinh(soMayTinh);
                return true;
            }
        }
        return false;
    }

    public boolean xoaPhongHoc(String maPhong, boolean xacNhan) {
        if (!xacNhan) {
            return false;
        }

        Iterator<PhongHoc> it = dsph.iterator();

        while (it.hasNext()) {
            PhongHoc p = it.next();

            if (p.getMaPhong().equalsIgnoreCase(maPhong)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    // 8. Tính tổng số phòng học
    public int tinhTongSoPhongHoc() {
        return dsph.size();
    }

    // 9. Lấy danh sách phòng máy có đúng 60 máy tính
    public ArrayList<PhongMayTinh> getPhongMayCo60May() {
        ArrayList<PhongMayTinh> kq = new ArrayList<>();

        for (PhongHoc p : dsph) {
            if (p instanceof PhongMayTinh) {
                PhongMayTinh pm = (PhongMayTinh) p;

                if (pm.getSoMayTinh() == 60) {
                    kq.add(pm);
                }
            }
        }
        return kq;
    }
}
