# Android Kotlin
Materi pada project ini adalah:
- Memhami struktur project
- `strings.xml`
- `<TextView>`
- `<EditText>`
- `<Button>`
- `<LinearLayout>`
- dll

### Screen Shoot App
![Fragment](volume-balok.gif)

## Materi
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
 
## Thanks to
- [x] Allah
- [x] [Sense Martin](https://github.com/martinputra) 🤗
- [x] Sumber referensi 
