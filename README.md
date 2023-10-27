Hilt 라이브러리

참조 : https://developer.android.com/training/dependency-injection/hilt-android?hl=ko

Hilt 란?
자바와 안드로이드를 위한 강력하고 빠른 의존성 주입 프레임워크
이전에 사용해봤던 Koin은 런타임에 의존성을 주입하므로 성능 감소가 있을 수 있음
Hilt는 컴파일시 의존성을 주입한다!

목차

1. 종속 항목 추가
   hilt-android-gradle-plugin 플러그인을 앱 수준의 build.gradle 파일에 추가
   Application 클래스에 Hilt적용 (@HiltAndroidApp)
2. Hilt 결합 정의
   @Inject 어노테이션을 사용하여 클래스의 인스턴스 제공법을 Hilt에게 알려준다
3. Hilt 모듈
   라이브러리나 인터페이스를 생성해서 사용하는 경우 @InstallIn 어노테이션으로 Hilt 모듈로 클래스를 Hilt에게 알려준다