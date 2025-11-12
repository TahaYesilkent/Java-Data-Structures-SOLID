# Workintech List & Palindrome & Decimal to Binary

Bu proje, Java ile veri yapıları ve algoritmaları çalışmak amacıyla hazırlanmıştır.  
Projede üç temel görev bulunmaktadır:

## 1. Palindrome Kontrol

`Main` sınıfı altında bulunan `checkForPalindrome(String input)` metodu, verilen string değerinin palindrome olup olmadığını kontrol eder.  
- Büyük/küçük harf duyarlılığı yoktur.
- Noktalama işaretleri ve boşluklar dikkate alınmaz.

Örnekler:
- `"I did, did I?"` → `true`
- `"Racecar"` → `true`
- `"hello"` → `false`
- `"Was it a car or a cat I saw ?"` → `true`

## 2. Decimal Sayıyı Binary'e Çevirme

`Main` sınıfında bulunan `convertDecimalToBinary(int number)` metodu, 10’luk sistemdeki bir sayıyı 2’lik tabana çevirir.

Örnekler:
- `5` → `101`
- `6` → `110`
- `13` → `1101`

## 3. WorkintechList

`WorkintechList` sınıfı, Java `ArrayList` sınıfının tüm özelliklerini taşır fakat ek özellikleri vardır:
- Aynı elemanı birden fazla kez eklemez.
- `sort()` metodu ile elemanları sıralayabilirsiniz.
- `remove(Object o)` metodu ile elemanı silip listeyi yeniden sıralayabilirsiniz.

Örnek Kullanım:

```java
WorkintechList<String> list = new WorkintechList<>();
list.add("Ali");
list.add("Mehmet");
list.add("Ali"); // eklenmez
list.sort();
list.remove("Mehmet");
