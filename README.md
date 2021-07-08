# Android Kotlin
Materi pada project ini adalah:
- Memhami struktur project
- `<LinearLayout>`
- `strings.xml`
- `<TextView>`
- `<EditText>`
- `<Button>`

### Screen Shoot App
![Fragment](volume-balok.gif)

## Materi
### LinearLayout
![Linear Layout](https://miro.medium.com/max/600/1*WdRMAHDHw85HkwSMzS5UsA.png)

Linear Layout adalah jenis layout dimana user menempatkan 1 objek (widget) secara vertikal atu horizontal. Pada LinearLayout ini dibutuhkan atribut orientasi horizontal atau vertikal contoh.
```xml
<LinearLayout
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp"
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/panjang" />

    <EditText
        android:id="@+id/edt_panjang"
        android:inputType="numberDecimal"
        android:lines="1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
</LinearLayout>
```

### Penggunaan strings.xml pada layout
strings.xml digunakan untuk menyimpan data-data resource pelabelan seperti label, hint, teks, nama tombol, dll. Contoh data pada strings.xml (bisa jadi ini mirip dengan variable pada xml).

```xml
<resources>
    <string name="app_name">Balok</string>
    <string name="panjang">Panjang</string>
</resources>
```

Pada <TextView> bisa digunakan seperti berikut
```xml
<TextView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="@string/panjang" />
```

### TextView
....

### EditText
....

### Button
...

### Casting View di Kotlin
...

### OnClickListener
...

### companion object {}
...
 
## Thanks to
- [x] Allah
- [x] [Sense Martin](https://github.com/martinputra) 🤗
- [x] Sumber referensi 
