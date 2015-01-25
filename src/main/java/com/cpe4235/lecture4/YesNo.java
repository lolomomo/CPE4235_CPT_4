/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpe4235.lecture4;

/**
 *
 * @author RainWhileLoop
 */
public enum YesNo {

    Yes(1), No(0);

    private int score = 0;

    private YesNo(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

}
