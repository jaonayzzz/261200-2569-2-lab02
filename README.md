# ข้อที่1
## instant variables
- String model เก็บรุ่น
- String serialNo เลขตัวเครื่อง
- boolean power เครื่องเปิดปิดอยู่อ้ะป่าว
- int pm25level ระดับฝุ่นที่เก็บเป็นเลขจำนวนเต็ม
- String mode โหมดการทำงาน
- int filterHoursUsed ชั่วโมงการใช้งาน
- int fanSpeed ระดับควางแรงพัดลม
## instant methods
- AirPurifier(String model, String serialNo) คอนสตรัคเตอร์สร้างเครื่องฟอกอากาศ
- turnOn(),turnOff() ฟังก์ชั้นเปิดปิดเครื่อง
- getPm25level() แสดงค่าฝุ่น
- changeMode(String getMode) เปลี่ยนโหมดการทำงาน
- updatePmLevel(int newData) อัปเดตค่าฝุ่นเอาไว้รับค่าในโหมดออโต้
- adjustFanSpeed() ปรับความเร็วพัดลมในโหมดออโต
- filterUsage() เพิ่มชั่วโฒงใช้งานตัวกรอง
- getFanSpeed() แสดงค่ารัดับพัดลม
## class variables
- totalCreated เก็บจำนวนเครื่องฟอกอากาศที่ผลิตออกมา
## class methods
- getTotalCreated() ดึงค่าจำนวนเครื่องที่สร้างอออกมา
# ข้อที่ 2
| วิธีการ | อินพุต | เอ้าพุต |
|---|---|---|
|AirPurifier()|model (String), serialNo (String)|-|
|turnOn()|-|void|
|turnOff()|-|void|
|getPm25level()|-|int (ค่าฝุ่น PM 2.5)|
|changeMode()|getMode (String)|void|
|updatePmLevel()|newData(int)|void|
|adjustFanSpeed()|-|void|
|adjustFanSpeed()|-|void|
|getFanSpeed()|-|int(ระดับความเร็วพัดลม)|
|getTotalCreated()|-|int(จำนวนเครื่องทั้งหมด)|
