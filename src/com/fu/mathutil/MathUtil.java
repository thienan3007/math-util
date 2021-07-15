/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author HP
 */
// ta viết cái class để cung cấp tiện iscch cho nơi khác xài 
// khi ta cung cấp tiện ích cho nơi khác xài, đó là lúc ta không cần nhớ cái gì cho riêng ta 
// hàm static sẽ giúp ta làm việc này 
public class MathUtil {
    // n! = 1.2.3.4.5.6
    // quy uoc: 0! - 1! - 1
    // ko tionh giai thua am 
    // 20! la vua khop kieu long, kieu long la toi da 18 so khg
    // nếu đưa vào âm hay lớn hơn 20 thì ta không tính
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
            // hàm dừng liền éo cần return
            
            // xuoosgn đây là n - 0..20 rồi
            
            if (n == 0 || n == 1)
                return 1; // dừng ngay khi n đặc biệt
            
            // xuông đến đây, n - 2..20 rồi
            // chơi for hoặc đẹ quy
            // kĩ thuật con heo đất
            // i == 2, i == 3, i == 4, i == 5 nhồi liên tục i vào đích
            long product = 1;// tích khởi đầu = 1, rồi nhổi từ từ vào 
            for (int i = 2; i <= n; i++) 
                product *= i;// product đagn có nhân với chính con i
            return product;
    }
}















