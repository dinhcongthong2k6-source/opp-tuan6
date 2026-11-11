package thong;

public class Main {
	public static void main(String[] args) {
		PhongHoc p1=new PhongLiThuyet("p1","day B" ,30 , 10, true);
		PhongHoc p2=new PhongLiThuyet("p2","day A" ,50 , 20, true);
		PhongHoc p3=new PhongMayTinh("p3", "day C", 70, 25, 40);
		PhongHoc p4=new PhongThiNghiem("p4", "day D", 50, 30, "Hoa Chat", 40, true);
		ListPhongHoc ql=new ListPhongHoc();
		ql.themPH(p1);
		ql.themPH(p2);
		ql.themPH(p3);
		ql.themPH(p4);
		//lay toan bo ds
		ql.xuatDSPhongHoc();
		//them
		PhongHoc p5=new PhongThiNghiem("p5", "day D", 50, 30, "Thi nghiem dao dong", 40, false);
		boolean h=ql.themPH(p5);
		if (h) {
			System.out.println("Them thanh cong");
		} else {
			System.out.println("Trung ma");
		}
		ql.xuatDSPhongHoc();
		//tim theo ma
		boolean k=ql.timKiemTheoMa("p1");
		if (k) {
			System.out.println("Tim thanh cong");
		} else {
			System.out.println("Khong thay");
		}
		// Lấy danh sách phòng học đạt chuẩn
	    System.out.println("\n=== PHONG HOC DAT CHUAN ===");
	    for (PhongHoc p : ql.getPhongHocDatChuan()) {
	        System.out.println(p);
	    }

	    // Sắp xếp tăng dần theo dãy nhà
	    System.out.println("\n=== TANG DAN THEO DAY NHA ===");
	    ql.sapXepTangTheoDayNha();
	    ql.xuatDSPhongHoc();

	    // Sắp xếp giảm dần theo diện tích
	    System.out.println("\n=== GIAM DAN THEO DIEN TICH ===");
	    ql.sapXepGiamTheoDienTich();
	    ql.xuatDSPhongHoc();

	    // Sắp xếp tăng dần theo số bóng đèn
	    System.out.println("\n=== TANG DAN THEO SO BONG DEN ===");
	    ql.sapXepTangTheoSoBongDen();
	    ql.xuatDSPhongHoc();

	    // Cập nhật số máy tính phòng P003 thành 60
	    System.out.println("\n=== CAP NHAT SO MAY TINH ===");
	    if (ql.capNhatSoMayTinh("p3", 60)) {
	        System.out.println("Cap nhat thanh cong!");
	    } else {
	        System.out.println("Khong tim thay phong may P003!");
	    }

	    // Lấy danh sách phòng máy có 60 máy tính
	    System.out.println("\n=== PHONG MAY CO 60 MAY ===");
	    for (PhongMayTinh p : ql.getPhongMayCo60May()) {
	        System.out.println(p);
	    }

	    // Tính tổng số phòng học
	    System.out.println("\nTong so phong hoc: "
	            + ql.tinhTongSoPhongHoc());

	    // Xóa phòng P002 sau khi xác nhận bằng biến true
	    System.out.println("\n=== XOA PHONG HOC ===");
	    String maPhongXoa = "p2";
	    boolean xacNhan = true;

	    if (xacNhan) {
	        if (ql.xoaPhongHoc(maPhongXoa, true)) {
	            System.out.println("Da xoa phong " + maPhongXoa);
	        } else {
	            System.out.println("Khong tim thay phong " + maPhongXoa);
	        }
	    } else {
	        System.out.println("Da huy thao tac xoa!");
	    }

	    // Hiển thị danh sách sau khi xóa
	    System.out.println("\n=== DANH SACH SAU KHI XOA ===");
	    ql.xuatDSPhongHoc();
	}
}

