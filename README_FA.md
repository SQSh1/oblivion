# 🇮🇷 نسخه SQ (فورک پیشرفته غیررسمی )
##  فراموشی - بهبود اتصال با پیشنهادی برای دریافت و استفاده اندوپوینت متناسب با ارائه دهنده‌ی اینترنت 

> "اینترنت، یا برای همه یا برای هیچ‌کس!"

**Oblivion** یک اپلیکیشن متن‌باز برای اتصال پایدار و امن به اینترنت است که با فناوری WireGuard و خدمات WARP از Cloudflare ساخته شده.  
نسخه یک بازسازی ویژه از این پروژه است که با هدف بهینه‌سازی تجربه‌ی کاربران فارسی‌زبان طراحی و توسعه داده شده — به‌صورت رایگان، آزاد و بدون تبلیغات.

---
<div dir="rtl" align="right">

###  ویژگی‌های شاخص SQ Edition

✅ **امنیت پیشرفته** با پیاده‌سازی بومی‌شده‌ی پروتکل WireGuard به زبان Go  
 **سرعت بهینه** با بهره‌گیری از کتابخانه‌ی پیشرفته‌ی `bepass-sdk`    
 **ورود هوشمند و دستی اندپوینت‌ها (IP:Port)** با قابلیت تشخیص و پیشنهاد خودکار  
 **آیکون تطبیقی (Adaptive Icon)** هماهنگ با طراحی مدرن لانچرهای اندروید  
 **ساختار ماژولار برای توسعه‌ی حرفه‌ای** و پشتیبانی از ابزارهای پیشرفته مانند Android Studio، LSPosed و Magisk  
 **بدون نیاز به VPN، بدون تبلیغات، بدون وابستگی به منابع خارجی**

---

###  چه چیزهایی در نسخه‌ی SQ Edition جدید است؟

 **صفحه‌ی آغازین بازطراحی‌شده** با طراحی اختصاصی و ارجاع به پروژه‌ی #یوسف‌قبادی (WelcomeActivity)  
 **ورودی اندپوینت هوشمند** با پیشنهاد خودکار هنگام تایپ و مدیریت آسان تنظیمات اتصال (EndpointActivity)  تابع checkServerConnection()
 **پشتیبانی پیش‌فرض از زبان فارسی**، بدون نیاز به تنظیم دستی زبان  
 **آیکون لانچر مدرن و هماهنگ** با استانداردهای طراحی Material  
 **زیرساخت آماده برای اتصال به ماژول‌های توسعه** مانند LSPosed و Magisk، مناسب توسعه‌دهندگان حرفه‌ای

</div>


##  شروع سریع

1. **دانلود برنامه:**  
   🔽 [دانلود نسخه تستی SQ (به‌زودی منتشر می‌شود)](https://github.com/SQSh1/oblivion/releases)

2. **نصب و اجرا:**  
   اپلیکیشن را نصب کرده، باز کنید و اتصال را تنها با یک لمس برقرار کنید.

---

## 🛠 راهنمای ساخت (برای توسعه‌دهندگان)

### پیش‌نیازها:
- Android Studio (آخرین نسخه)
- NDK نسخه `r26b (26.1.10909125)`
- Go نسخه `1.22`

### مراحل:
1. پروژه را در Android Studio باز کنید.  
2. از منوی بالا `Build > Generate Signed Bundle / APK...` را انتخاب کنید.  
3. گزینه `APK` را بزنید و اطلاعات امضا را وارد کنید.  
4. فایل خروجی APK را تحویل بگیرید.

>  اگر کی‌استور ندارید، می‌توانید از نسخه‌ی دیباگ استفاده کنید یا یکی بسازید.

---

##  مشارکت و ارتباط

اگر علاقه‌مند به توسعه یا ارائه پیشنهاد برای بهبود این پروژه هستید، می‌توانید از طریق Issues یا Pull Request در [گیت‌هاب SQ](https://github.com/SQSh1/oblivion) با ما در ارتباط باشید.

---

## 📜 مجوز انتشار

این پروژه تحت لایسنس [CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/) منتشر شده — رایگان برای استفاده غیرتجاری، با امکان بازتوزیع تحت شرایط مشابه.

---

##  مستندات انگلیسی

برای مطالعه‌ی نسخه انگلیسی این مستند، به فایل اصلی [README.md](https://github.com/SQSh1/oblivion/blob/main/README.md) مراجعه فرمایید.
