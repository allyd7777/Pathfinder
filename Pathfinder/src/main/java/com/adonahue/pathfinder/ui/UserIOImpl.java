package com.adonahue.pathfinder.ui;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author allison
 */
public class UserIOImpl implements UserIO{
    Scanner sc = new Scanner(System.in);

    @Override
    public int readInt(String prompt) {
        int num = 0;
        while (true) {
            try {
                System.out.println(prompt);
                num = sc.nextInt();
                sc.nextLine();
                return num;
            } catch (Exception e) {
                System.out.println("Not a valid input!");
            }
        }
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        while (true) {
            try {
                System.out.println(prompt);
                int num = sc.nextInt();
                sc.nextLine();
                while (num > max || num < min) {
                    System.out.println(prompt);
                    num = sc.nextInt();
                }
                return num;
            } catch (Exception e) {
                System.out.println("Not a valid input!");
                sc.nextLine();
            }
        }
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        String message = sc.nextLine();
        if (message.equals("")) {
            message = " ";
        }
        return message;
    }

    @Override
    public float readFloat(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                float num = sc.nextFloat();
                return num;
            } catch (Exception e) {
                System.out.println("Not a valid input!");
                sc.nextLine();
            }
        }
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        while (true) {
            try {
                System.out.println(prompt);
                float num = sc.nextFloat();
                while (num > max || num < min) {
                    System.out.println(prompt);
                    num = sc.nextInt();
                }
                return num;
            } catch (Exception e) {
                System.out.println("Not a valid input!");
                sc.nextLine();
            }
        }
    }

    @Override
    public double readDouble(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                double a = sc.nextDouble();
                sc.nextLine();
                return a;
            } catch (Exception e) {
                System.out.println("Not a valid input!");
                sc.nextLine();
            }
        }
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        while (true) {
            try {
                System.out.println(prompt);
                double num = sc.nextDouble();
                while (num > max || num < min) {
                    System.out.println(prompt);
                    num = sc.nextInt();
                }
                return num;
            } catch (Exception e) {
                System.out.println("Not a valid input!");
                sc.nextLine();
            }
        }
    }

    @Override
    public void println(String message) {
        System.out.println(message);
    }
    
    @Override
    public void print(String message){
        System.out.print(message);
    }

    @Override
    public long readLong(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                long num = sc.nextLong();
                return num;
            } catch (Exception e) {
                System.out.println("Not a valid input!");
                sc.nextLine();
            }
        }
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        while (true) {
            try {
                System.out.println(prompt);
                long num = sc.nextLong();
                while (num > max || num < min) {
                    System.out.println(prompt);
                    num = sc.nextInt();
                }
                return num;
            } catch (Exception e) {
                System.out.println("Not a valid input!");
                sc.nextLine();
            }
        }
    }

    @Override
    public BigDecimal readBigDecimal(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                BigDecimal num = sc.nextBigDecimal();
                return num;
            } catch (Exception e) {
                System.out.println("Not a valid input!");
                sc.nextLine();
            }
        }
    }

    @Override
    public BigDecimal readBigDecimal(String prompt, BigDecimal min, BigDecimal max) {
        while (true) {
            try {
                System.out.println(prompt);
                BigDecimal num = sc.nextBigDecimal();
                while (num.compareTo(max) > 0 || num.compareTo(min) < 0) {
                    System.out.println(prompt);
                    num = sc.nextBigDecimal();
                }
                return num;
            } catch (Exception e) {
                System.out.println("Not a valid input!");
                sc.nextLine();
            }
        }
    }
}
