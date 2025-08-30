package com.sprint.jw.godofjava.Volume1.Chapter07;

/*한 학년에는 5개의 반이 있다. 각 학생들의 키를 하나의 배열에 저장하여 관리하는 프로그램을 작성하자.*/

public class ManageHeight {

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        for (int classNo = 0; classNo < 5; classNo++) {
            manageHeight.printHeight(classNo);
            manageHeight.printAverage(classNo);

        }
    }

    int[][] gradeHeights;

    public void setData() {
        gradeHeights = new int[5][];
        gradeHeights[0] = new int[]{170, 180, 173, 175, 177};
        gradeHeights[1] = new int[]{160, 165, 167, 186};
        gradeHeights[2] = new int[]{158, 177, 187, 176};
        gradeHeights[3] = new int[]{173, 182, 181};
        gradeHeights[4] = new int[]{170, 180, 165, 177, 172};
    }

    public void printHeight(int classNo) {
        System.out.println("ClassNo: " + (classNo + 1));
        for (int data : gradeHeights[classNo]) {
            System.out.println(data);
        }
    }

    public void printAverage(int classNo) {
        double total = 0;
        for (int data : gradeHeights[classNo]) {
            total += data;
        }
        System.out.println("ClassNo: " + (classNo + 1) + "의 키 평균 = " + total / gradeHeights[classNo].length);
    }
}
