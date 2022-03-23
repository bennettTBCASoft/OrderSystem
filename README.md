# OrderSystem

### Component
- RadioButton

### Function
// 不用宣告每一個RadioButton findViewById，用checkedRadioButtonId去取得選到的RadioButton

- radioGroup.findViewById<RadioButton>(radioGroup.checkedRadioButtonId).text.toString

- startActivity(intent)
- intent.putExtra
- intent.putExtras + bundle

// 返回資料至上一個畫面

- registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {result -> }
- launch() instead of the "startActivity"
- setResult()
- finish()

### HackMD 筆記
https://hackmd.io/OCASdzU3SMyUjEL5N5pohg

### onActivityResult 棄用說明：
onActivityResult & startActivityForResult 被棄用
使用：ActivityResultContract & ActivityResultLauncher
https://iter01.com/546500.html

