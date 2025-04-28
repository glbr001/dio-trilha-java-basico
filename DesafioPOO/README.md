## Dio Java Básico - Desafio POO
```mermaid
classDiagram
    direction TB
    class WebBrowser {
        -boolean isConnected()
        +openUrl() 
        +showPage(String url)
        +addNewTab()
        +refreshPage()
    }

    class MobilePhone {
        +void call(String number)
        +void answer()
        +void initVoiceMail()
    }

    class Iphone {
    }

    class MusicPlayer {
        -boolean isPlaying() 
        +void play()
        +void pause()
        +void stop()
        +void selectMusic(String music)
    }

    <<Interface>> WebBrowser
    <<Interface>> MobilePhone
    <<Class>> Iphone
    <<Interface>> MusicPlayer

    Iphone --|> MobilePhone
    Iphone --|> MusicPlayer
    Iphone --|> WebBrowser
```
