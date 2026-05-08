package org.ouch;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class AssertionTest {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();

        // Simulasi input RPN: 3 5 + (Artinya 3 + 5)
        Deque<String> expression = new ArrayDeque<>(Arrays.asList("3", "5", "+"));
        
        String result = calc.calculate(expression);

        // --- JAVA ASSERTION ---
        // Jika hasil bukan 8, program akan berhenti dan melempar error
        assert result.equals("8") : "Gagal! Hasil harusnya 8, tapi malah: " + result;

        System.out.println("Integrasi Sukses! Hasil kalkulasi: " + result);
    }
}