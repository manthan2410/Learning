package org.example;

public class StudentWithBuilderPattern
{
    //now we not use constructor to call object..



        private String name;
        private int age;
        private String city;

        private StudentWithBuilderPattern(){

        }
        public StudentWithBuilderPattern setName(String name) {
            this.name = name;
            return this;
        }

        public StudentWithBuilderPattern setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentWithBuilderPattern setCity(String city) {
            this.city = city;
            return this;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", city='" + city + '\'' +
                    '}';
        }

        public static StudentWithBuilderPattern of()
        {
            return new StudentWithBuilderPattern();
        }
    }


