package org.ouch;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class AssertionTest {
    public static void main(String[] args) {
        System.out.println("Memulai Testing...");
        try {
            Calculator calc = new Calculator();
            
            // Tes case: 3 5 + (Artinya 3 + 5)
            Deque<String> expression = new ArrayDeque<>(Arrays.asList("3", "5", "+"));
            
            String result = calc.calculate(expression);
            System.out.println("Hasil dari Calculator: " + result);

            // Cek hasil
            if (!result.equals("8")) {
                throw new RuntimeException("LOGIKA SALAH! Seharusnya 8 tapi dapat: " + result);
            }

            // Cek Assertion (Pastikan flag -ea aktif)
            assert result.equals("8") : "Assertion Gagal!";
            
            System.out.println("Semua tes berhasil!");

        } catch (Throwable e) {
            System.err.println("=== ERROR DITEMUKAN ===");
            e.printStackTrace(); // Ini akan memunculkan detail error di GitHub Actions
            System.exit(1); 
        }
    }
}