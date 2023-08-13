package Homework;

public class Human {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String birthday;
    private Integer phoneNumber;
    private char gender;

    public Human(String userTerm) {
        String[] data = this.getUserData(userTerm);
        this.setLastName(data[0]);
        this.setFirstName(data[1]);
        this.setPatronymic(data[2]);
        this.setBirthday(data[3]);
        this.setPhoneNumber(data[4]);
        this.setGender(data[5]);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.validateTerm(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.validateTerm(lastName);
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.validateTerm(patronymic);
        this.patronymic = patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        if (!birthday.matches("^(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[012])\\.((19|20)\\d\\d)$")) {
            throw new RuntimeException("Некорректный формат даты рождения.");
        } else {
            this.birthday = birthday;
        }
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        try {
            this.phoneNumber = Integer.valueOf(phoneNumber);
        } catch (Exception e) {
            throw new RuntimeException("Некорректный формат номера телефона " + e.getMessage());
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if ((gender.equalsIgnoreCase("m") || 
        gender.equalsIgnoreCase("f")) && 
        gender.length() == 1) {
            this.gender = gender.toLowerCase().charAt(0);
        } else {
            throw new RuntimeException("Некорректный формат указания пола контакта.");
        }
    }
    
    private String[] getUserData(String userTerm) {
        String[] data = userTerm.split(" ");
        if (data.length != 6) {
            throw new RuntimeException("Некорректный формат контакта: ожидалось шесть полей чеоез пробел. ");
        }
        return data;
    }

    private void validateTerm(String term) {
        if (!term.matches("^[A-z]+$")) {
            throw new RuntimeException("Некорректный формат Ф.И.О.: ожидались латинские буквы из диапазона от A до z.");
        }
    }
}