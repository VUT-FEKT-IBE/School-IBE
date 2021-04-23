package com.vutbr.feec.cviceniDatabaze;

import java.util.Scanner;

/**
 * T��da slou��c� k v�b�ru u�ivatelsk� volby z konzole
 * 
 * Ji�� P�inosil
 * 
 */
public class ConsoleInput {

  public static int readNumberInputFromConsole(Scanner sc) {
    int cislo = 0;
    try {
      cislo = sc.nextInt();
    } catch (Exception e) {
      System.out.println("Nastala vyjimka typu " + e.toString());
      System.out.println("zadejte prosim cele cislo ");
      sc.nextLine();
      cislo = readNumberInputFromConsole(sc);
    }
    return cislo;
  }

}
