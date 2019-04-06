package com.first;

public class CentAmountFieldValueConverter {

    public static void main(String[] args) {

    }

   /* public void convert(Field field) {
        String value = (String) field.getDestValue(); //这里直接toString吧，而且得到的value需要保证格式可以转化为数值型
        if (StringUtils.isBlank(value)) {
            return;
        }

        try {
            long cent = Long.parseLong(value); //value转化为Long型不能越界
            Money amount = new Money(cent);
            amount.setCent(cent);
            field.setDestValue(amount.toString());
        } catch (Exception e) {
            field.setDestValue(value);
        }

    }*/
}
