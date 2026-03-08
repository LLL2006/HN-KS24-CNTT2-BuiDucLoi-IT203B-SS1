package exception;

import java.util.Scanner;

public class InputHelper {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== CHƯƠNG TRÌNH KIỂM TRA NHẬP LIỆU ===");

        // Thử nghiệm nhập số nguyên
        int tuoi = inputInt("Nhập tuổi của bạn: ");

        // Thử nghiệm nhập số thực
        double diem = inputDouble("Nhập điểm trung bình: ");

        // Thử nghiệm nhập số thực float
        float chieuCao = inputFloat("Nhập chiều cao (m): ");

        // Thử nghiệm nhập số long
        long soTaiKhoan = inputLong("Nhập số thẻ ngân hàng: ");

        // Thử nghiệm nhập logic
        boolean isVip = inputBoolean("Bạn có phải khách hàng VIP không?");

        // Thử nghiệm nhập ký tự
        char gioiTinh = inputChar("Nhập giới tính (M/F): ");

        // Thử nghiệm nhập chuỗi
        String ten = inputString("Nhập họ tên đầy đủ: ");

        System.out.println("\n--- THÔNG TIN ĐÃ NHẬP ---");
        System.out.printf("Tên: %s | Tuổi: %d | Điểm: %.2f | Cao: %.2f\n", ten, tuoi, diem, chieuCao);
        System.out.println("Số TK: " + soTaiKhoan + " | VIP: " + isVip + " | Giới tính: " + gioiTinh);
    }

    // --- CÁC PHƯƠNG THỨC HỖ TRỢ (MÌNH TỔNG HỢP LẠI Ở ĐÂY) ---

    public static int inputInt(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(">> Lỗi: Phải nhập số nguyên (int)!");
            }
        }
    }

    public static float inputFloat(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return Float.parseFloat(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(">> Lỗi: Phải nhập số thực (float)!");
            }
        }
    }

    public static double inputDouble(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(">> Lỗi: Phải nhập số thực (double)!");
            }
        }
    }

    public static long inputLong(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return Long.parseLong(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(">> Lỗi: Phải nhập số nguyên dài (long)!");
            }
        }
    }

    public static boolean inputBoolean(String message) {
        while (true) {
            System.out.print(message + " (true/false): ");
            String input = sc.nextLine().trim().toLowerCase();
            if (input.equals("true")) return true;
            if (input.equals("false")) return false;
            System.out.println(">> Lỗi: Chỉ nhập 'true' hoặc 'false'!");
        }
    }

    public static char inputChar(String message) {
        while (true) {
            System.out.print(message + " ");
            String input = sc.nextLine();
            if (input.length() == 1) return input.charAt(0);
            System.out.println(">> Lỗi: Chỉ nhập duy nhất 1 ký tự!");
        }
    }

    public static String inputString(String message) {
        while (true) {
            System.out.print(message + " ");
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) return input;
            System.out.println(">> Lỗi: Không được bỏ trống!");
        }
    }
}
