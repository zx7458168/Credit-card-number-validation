class CardVarification {
    
    String cardNumber;
    boolean ifValid;

    public CardVarification(String cardNumberInput) {
        this.cardNumber = cardNumberInput;
    }

    void varification() {

        int[] cardNo = new int[cardNumber.length()];
        for (int i = 0; i < cardNumber.length(); i++) {
            cardNo[i] = Integer.parseInt(cardNumber.substring(i, i + 1));
        }

        if (cardNumber.length() % 2 == 0) {
            for (int i = cardNumber.length() - 1; i >= 0; i--) {
                if (i % 2 != 0) {
                    continue;
                } else {
                    if (cardNo[i] <= 4) {
                        cardNo[i] *= 2;
                    } else {
                        int temp = cardNo[i] * 2 / 10;
                        cardNo[i] = temp + cardNo[i] * 2 % 10;
                    }
                }
            }
        }
        int tempp = 0;
        for (int j : cardNo) {
            tempp += j;
        }
        if (tempp % 10 == 0) {
            this.ifValid = true;
        } else {
            this.ifValid = false;
        }
    }

    void printValidation() {
        if (ifValid == true) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
