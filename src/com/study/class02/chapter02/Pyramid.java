package com.study.class02.chapter02;

public class Pyramid {
    public static void main(String[] args) {

        String[][] arr = new String[4][3];
        arr[0][0]="오범수";
        arr[0][1]="박종민";
        arr[0][2]="찐따";
        arr[1][0]="애자";
        arr[1][1]="빵셔틀";
        arr[1][2]="라면셔틀";
        arr[2][0]="급식셔틀";
        arr[2][1]="센드백";
        arr[2][2]="꼬붕";
        arr[3][0]="친구1";
        arr[3][1]="친구2";
        arr[3][2]="안친한 친구3";

        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                System.out.print("["+arr[i][j]+"]");
            }
            System.out.println();
        }

        //위와 같다
        // for(int i = 0; i<4;i++){
        //     for(int j = 0; j<3;j++){
        //         System.out.print("["+arr[i][j]+"]");
        //     }
        //     System.out.println();
        // }
    }
}
