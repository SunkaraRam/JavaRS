Run("C:\Windows\system32\notepad.exe")

WinWaitActive("Untitled - Notepad",3)

Send("Hi My dear Friends This is RamSunkara")

Send("{Enter}")

Send("This Mail is automatically send by RS")

WinClose("Notepad")

ControlClick("Save as" , "" ,"Button1")