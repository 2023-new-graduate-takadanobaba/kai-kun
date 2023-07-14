package main.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Tests {

    @Test
    public void ボタンが押せるかどうかの確認() {
        // 準備
        VendingMachine sut = new VendingMachine();
        // 実行
        sut.push();
        // 検証
        boolean actual = sut.isPushed();
        assertEquals(true, actual);
    }
        @Test
    public void ボタンが押されていないことの確認() {
        // 準備
        VendingMachine sut = new VendingMachine();
        // 実行
        // 検証
         boolean actual = sut.isPushed();
        assertEquals(false, actual);
        }
   @Test
    public void ボタンを押すとコーラがでる() {
        // 準備
        VendingMachine sut = new VendingMachine();
        // 実行
    sut.push();
    
        // 検証
        String actual 
        assertEquals(true, actual);
    }
}

