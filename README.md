# 📘 Tổng Hợp Kiến Thức Lập Trình Java Cơ Bản - PNV28

Chào mừng bạn đến với kho lưu trữ bài tập và kiến thức Java. Tài liệu này giúp hệ thống lại các câu lệnh quan trọng, từ những viên gạch đầu tiên đến các khái niệm bổ trợ cho Lập trình hướng đối tượng (OOP).

---

## 📑 Mục lục
1. [Phân loại các câu lệnh cơ bản](#1-phân-loại-các-câu-lệnh-cơ-bản)
2. [Điều khiển luồng chương trình](#2-điều-khiển-luồng-chương-trình)
3. [Xử lý lỗi & Ngoại lệ](#3-xử-lý-lỗi--ngoại-lệ)
4. [Các câu lệnh đặc biệt](#4-các-câu-lệnh-đặc-biệt)
5. [Tổng kết & Lời khuyên](#5-tổng-kết--lời-khuyên)

---

## 1. Phân loại các câu lệnh cơ bản

Các câu lệnh này là nền tảng để quản lý và xử lý dữ liệu trong Java.

### 🔹 Khai báo biến (Declaration Statement)
Dùng để xác định kiểu dữ liệu cho biến.
- **Cú pháp:** `<kieu_du_lieu> <ten_bien>;`
- **Ví dụ:** `int age;`, `String name;`

### 🔹 Gán giá trị (Assignment Statement)
Đưa dữ liệu vào biến đã khai báo.
- **Cú pháp:** `<ten_bien> = <gia_tri>;`
- **Ví dụ:** `age = 25;`, `name = "Nguyen Van A";`

### 🔹 In ra màn hình (Print Statement)
- `System.out.println()`: In nội dung và tự động xuống dòng.
- `System.out.print()`: In nội dung nhưng không xuống dòng.
- `System.out.printf()`: In theo định dạng (Ví dụ: `%.2f` để lấy 2 số thập phân).

### 🔹 Nhập liệu từ bàn phím (Input Statement)
Sử dụng lớp `Scanner` để đọc dữ liệu người dùng.
```java
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);

String name = scanner.nextLine(); // Nhập chuỗi
int age = scanner.nextInt();      // Nhập số nguyên
