# Java IOs - Practical content

Each line shows the time, in nanoseconds (ns) taken to Write or Read (W/R) Binary or Text files (B/T) and buffered or non buffered (buff/-).
Writing times:

| Size | WB          | WB buff   | WT        | WT buff   | Best    |
|------|-------------|-----------|-----------|-----------|---------|
| 1B   | 1689400     | 1158000   | 1359900   | 1000700   | WT buff |
| 1KiB | 27184900    | 1363100   | 9198200   | 1917400   | WB buff |
| 1MiB | 5632567500  | 20959000  | 110726700 | 24578000  | WB buff |
| 5MiB | 19507522800 | 128551200 | 222880900 | 126980000 | WT buff |

Reading times:

| Size | RB          | RB buff   | RT        | RT buff   | Best    |
|------|-------------|-----------|-----------|-----------|---------|
| 1B   | 394200      | 322200    | 1072900   | 416400    | RB buff |
| 1KiB | 7284600     | 927800    | 4191300   | 1197800   | RB buff |
| 1MiB | 3806873700  | 26179000  | 144640300 | 29252400  | RB buff |
| 5MiB | 17398679300 | 124319800 | 224894300 | 124876400 | RB buff |

Of note, the W/RT buff times will probably reach smaller times than RB buff for a larger size.

The Text reading/writing buffered is more appropriate for large size of file while Binary reading/writing is more often than not better for smaller file size (except in very small writing cases).

The difference between binary and text data is that text data can be read directly by people while binary comprises data in 0 and 1 format, to be interpreted by the computer depending on its usage (a picture, a word document, an executable).

Character encoding is the way to encode a character for a computer. The current norm is UTF-8 in most cases as it helps cover all languages. But using less advanced encoding such as ASCII or ANSI variants, but that makes special characters like emoji not being displayed.

As for the methodology being used, We could use more samples to eliminate outliers or applied only between the winning possibilities (as to avoid losing too much time waiting on the program execution) but I decided otherwise given the small scope of the project.

