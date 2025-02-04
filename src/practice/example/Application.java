package practice.example;
// 20250120-7
import practice.example.entity.Seat;
import practice.example.factory.SeatFactory;

import practice.example.screen.frame.BaseFrame;

import javax.swing.*;
public class Application {
    public static void main(String[] args) {
        JFrame baseFrame = new BaseFrame();
    }
}
/*
        System.out.println(SeatFactory.getSeats());

        Seat seat1 = SeatFactory.from(1);
        Seat seat2 = SeatFactory.from(1);

        System.out.println(SeatFactory.getSeats());

        System.out.println("seat1 == seat2? " + (seat1 == seat2));
    }
}
// 숙제할때 참조하기*/
