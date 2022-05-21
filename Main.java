package com.battle.dice.game;

import java.util.*;

public class Main {

    public static void promptEnterKey(){
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void panduanBattleDiceGame() {
        System.out.println("======================================================\n" +
                "Panduan BATTLE DICE GAME\n" +
                "Game ini dimainkan dengan 2 player.\n" +
                "Masukkan nama player 1 dan player 2." +
                "Setiap player Akan diberikan 3 kali kesempatan untuk melempar random DICE.\n" +
                "Jika DICE score yang muncul sama dengan score sebelumnya, maka score setelah ditambahkan di x2\n" +
                "Contoh: (roll1 + roll2) x 2\n" +
                "Game dimenangkan oleh player dengan score tertinggi.\n" +
                "======================================================");
    }

    // Function BATTLE DICE GAME
    public static void playBattleDiceGame() {

        Scanner scanner = new Scanner(System.in);

        Random ran = new Random();

        // Variable nama player 1-2
        String playerName1, playerName2;

        // Variable score roll1-3
        int scoreRoll1, scoreRoll2, scoreRoll3, totalScoreRoll;

        //Variable total score Player 1-2
        int totalScorePlayer1, totalScorePlayer2;

        // Start Gameplay
        System.out.println("Masukkan nama player 1: ");
        playerName1 = scanner.nextLine();

        System.out.println("Masukkan nama player 2: ");
        playerName2 = scanner.nextLine();

        // Random DICE score range 1-6;
        int x1 = ran.nextInt(6);

        // Lemparan dadu pertama player 1
        scoreRoll1 = x1 + 1;
        System.out.print("Lemparan dadu pertama: " + playerName1 + " DICE Score: " + scoreRoll1 + "\n");
        totalScoreRoll = scoreRoll1;

        promptEnterKey();

        // Random DICE score range 1-6;
        int y1 = ran.nextInt(6);

        // Lemparan dadu kedua player 1
        scoreRoll2 = y1 + 1;
        System.out.print("Lemparan dadu kedua: " + playerName1 + " DICE Score: " + scoreRoll2 + "\n");

        //Cek jika angka sama dengan roll1
        if(scoreRoll1 == scoreRoll2) {
            totalScoreRoll = (scoreRoll1 + scoreRoll2) * 2;
        } else {
            totalScoreRoll = scoreRoll1 + scoreRoll2;
        }

        promptEnterKey();

        // Random DICE score range 1-6;
        int z1 = ran.nextInt(6);

        // Lemparan dadu ketiga player 1
        scoreRoll3 = z1 + 1;
        System.out.print("Lemparan dadu ketiga: " + playerName1 + " DICE Score: " + scoreRoll3 + "\n");

        // Cek jika angka sama dengan roll2
        if(scoreRoll3 == scoreRoll2) {
            totalScoreRoll = (totalScoreRoll + scoreRoll3) * 2;
        } else {
            totalScoreRoll = totalScoreRoll + scoreRoll3;
        }

        // Save total score player 1.
        totalScorePlayer1 = totalScoreRoll;

        System.out.println("Total score " + playerName1 + ": " + totalScoreRoll);

        promptEnterKey();

        // Reset score
        scoreRoll1 = 0;
        scoreRoll2 = 0;
        scoreRoll3 = 0;
        totalScoreRoll = 0;

        // Random DICE score range 1-6;
        int x2 = ran.nextInt(6);

        // Lemparan dadu pertama player 2
        scoreRoll1 = x2 + 1;
        System.out.print("Lemparan dadu pertama: " + playerName2 + " DICE Score: " + scoreRoll1 + "\n");
        totalScoreRoll = scoreRoll1;

        promptEnterKey();

        // Random DICE score range 1-6;
        int y2 = ran.nextInt(6);

        // Lemparan dadu kedua player 2
        scoreRoll2 = y2 + 1;
        System.out.print("Lemparan dadu kedua: " + playerName2 + " DICE Score: " + scoreRoll2 + "\n");

        //Cek jika angka sama dengan roll1
        if(scoreRoll1 == scoreRoll2) {
            totalScoreRoll = (scoreRoll1 + scoreRoll2) * 2;
        } else {
            totalScoreRoll = scoreRoll1 + scoreRoll2;
        }

        promptEnterKey();

        // Random DICE score range 1-6;
        int z2 = ran.nextInt(6);

        // Lemparan dadu ketiga player 2
        scoreRoll3 = z2 + 1;
        System.out.print("Lemparan dadu ketiga: " + playerName2 + " DICE Score: " + scoreRoll3 + "\n");

        // Cek jika angka sama dengan roll2
        if(scoreRoll3 == scoreRoll2) {
            totalScoreRoll = (totalScoreRoll + scoreRoll3) * 2;
        } else {
            totalScoreRoll = totalScoreRoll + scoreRoll3;
        }

        // Save total score player 2.
        totalScorePlayer2 = totalScoreRoll;

        System.out.println("Total score " + playerName2 + ": " + totalScoreRoll);

        promptEnterKey();

        // Compare hasil score player 1 dan player 2
        System.out.println("======================================================\n" +
                "GAME RESULT");
        if(totalScorePlayer1 > totalScorePlayer2) {
            System.out.println("Selamat! Player 1 dengan nama " + playerName1 + " menang dengan total score: " + totalScorePlayer1);
        } else {
            System.out.println("Selamat! Player 2 dengan nama " + playerName2 + " menang dengan total score: " + totalScorePlayer2);
        }
        System.out.println("======================================================");

        // Reset all scores
        scoreRoll1 = 0;
        scoreRoll2 = 0;
        scoreRoll3 = 0;
        totalScoreRoll = 0;

        totalScorePlayer1 = 0;
        totalScorePlayer2 = 0;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberInput = 0;

        System.out.println("BATTLE DICE GAME");

        do {

            System.out.println("Selamat datang di BATTLE DICE GAME!\n" +
                    "Kita lihat siapakah yang akan mencetak score paling banyak kali ini...\n" +
                    "1. Tampilkan panduan BATTLE DICE GAME.\n" +
                    "2. Mulai BATTLE DICE GAME!\n" +
                    "3. Keluar dari BATTLE DICE GAME!\n" +
                    "(Pilih 1, 2 atau 3)");

            try
            {
                numberInput = scanner.nextInt();
            }

            catch (java.util.InputMismatchException e)
            {
                System.out.println("Invalid Input\n" +
                        "Exit game...");
                return;
            }

            switch (numberInput) {
                case 1:
                    panduanBattleDiceGame();
                    break;
                case 2:
                    playBattleDiceGame();
                    break;
                default:
                    break;
            }

        } while (numberInput != 3);

        System.out.println("Terima kasih sudah bermain!");
    }
}