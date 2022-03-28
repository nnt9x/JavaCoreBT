package bai3a;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nhập dữ liêu từ bàn phím -> N tam giác
        // In ra tam giác các cạnh của tam giác có diện tích lớn nhất

        // try-catch -> chạy đoạn lệnh an toàn-> có lỗi, ko bị dừng hoặc văng ra ngoài

        // Bước 1: Nhập N
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập kích thước N = ");
        int N = in.nextInt();
        // Bước 2: Nhập chi tiết cho N tam giác
        TamGiac mangTamGiac[] = new TamGiac[N];
        int count = 0;

        while (true){
            try{
                System.out.print("Nhập các cạnh (a, b, c): ");
                long a = in.nextLong();
                long b = in.nextLong();
                long c = in.nextLong();
                long canh[] = {a, b, c};
                mangTamGiac[count] = new TamGiac(canh);
                if(count == (N-1)) break;
                count++;
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        in.close();


        // Bước 3: tìm max
        double maxDienTich = mangTamGiac[0].tinhDienTich();

        for (int i = 1; i < N; i++ ){
            if(mangTamGiac[i].tinhDienTich() > maxDienTich){
                maxDienTich = mangTamGiac[i].tinhDienTich();
            }
        }

        // Bước 4: In ra các cạnh của tam giác đó
        for(int i = 0; i < N; i++){
            if(mangTamGiac[i].tinhDienTich() == maxDienTich){
                mangTamGiac[i].inCanh();
            }
        }

    }
}
