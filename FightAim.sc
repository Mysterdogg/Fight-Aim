{$CLEO .cs}
Alloc($PLAYER_ACTOR, 3)
Alloc($PLAYER_CHAR, 2)

script_name "FGTAIM"
19@ = 0

:FGTAIM_17
gosub @FGTAIM_1686
gosub @FGTAIM_1357
gosub @FGTAIM_1473

:FGTAIM_38
wait 0
if 
  1@ > 0
goto_if_false @FGTAIM_117
if 
  is_key_pressed 1@
goto_if_false @FGTAIM_117

:FGTAIM_76
wait 0
if 
  is_key_pressed 1@
goto_if_false @FGTAIM_103
goto @FGTAIM_76

:FGTAIM_103
19@ = 1
goto @FGTAIM_17

:FGTAIM_117
if 
  0@ == 1
goto_if_false @FGTAIM_38
gosub @FGTAIM_149
goto @FGTAIM_38

:FGTAIM_149
6@ = 0
7@ = read_memory 12216344 {size} 1 {vp} False
if 
  7@ == 0
goto_if_false @FGTAIM_575
if 
  is_player_playing $PLAYER_CHAR
goto_if_false @FGTAIM_489
if 
  is_char_in_any_car $PLAYER_ACTOR
goto_if_false @FGTAIM_227
goto @FGTAIM_489

:FGTAIM_227
if 
  is_char_swimming $PLAYER_ACTOR
goto_if_false @FGTAIM_250
goto @FGTAIM_489

:FGTAIM_250
7@ = read_memory 11989093 {size} 1 {vp} False
if 
  7@ == 0
goto_if_false @FGTAIM_489
7@ = get_ped_pointer $PLAYER_ACTOR
7@ += 1328
7@ = read_memory 7@ {size} 4 {vp} False
if and
  7@ > 0
  7@ < 53
goto_if_false @FGTAIM_489
7@ = get_current_char_weapon $PLAYER_ACTOR
call_function_return 7617632 {numArgs} 2 {pop} 2 {args} 1 {var_funcRet} 7@ 7@ 
if 
  7@ <> 0
goto_if_false @FGTAIM_489
7@ += 0
7@ = read_memory 7@ {size} 4 {vp} False
if 
  7@ == 0
goto_if_false @FGTAIM_489
if 
  is_button_pressed PadId.Pad1 {buttonId} Button.RightShoulder1
goto_if_false @FGTAIM_489
if and
  4@ == 1
  3@ == 1
goto_if_false @FGTAIM_474
6@ = 1
goto @FGTAIM_489

:FGTAIM_474
gosub @FGTAIM_910
set_lvar_int_to_lvar_int 6@ = 25@

:FGTAIM_489
8@ = 1
if 
  6@ == 1
goto_if_false @FGTAIM_521
8@ = 0

:FGTAIM_521
9@ = read_memory 11988014 {size} 1 {vp} False
if 
  is_int_lvar_equal_to_int_lvar 9@ == 8@
goto_if_false @FGTAIM_561
goto @FGTAIM_575

:FGTAIM_561
write_memory 11988014 {size} 1 {value} 8@ {vp} False

:FGTAIM_575
set_lvar_int_to_lvar_int 4@ = 6@
if 
  2@ == 1
goto_if_false @FGTAIM_709
9@ = read_memory 12045188 {size} 4 {vp} False
if 
  6@ == 1
goto_if_false @FGTAIM_656
set_lvar_int_to_lvar_int 28@ = 9@
28@ += 500
goto @FGTAIM_709

:FGTAIM_656
if 
  is_int_lvar_greater_than_int_lvar 28@ > 9@
goto_if_false @FGTAIM_709
27@ = 13150264
gosub @FGTAIM_852
27@ = 13150308
gosub @FGTAIM_852

:FGTAIM_709
8@ = 0
if 
  2@ == 2
goto_if_false @FGTAIM_741
8@ = 1

:FGTAIM_741
if 
  is_int_lvar_equal_to_int_lvar 8@ == 5@
goto_if_false @FGTAIM_762
return 

:FGTAIM_762
set_lvar_int_to_lvar_int 5@ = 8@
if 
  8@ == 1
goto_if_false @FGTAIM_820
write_memory 5497312 {size} 4 {value} -1869574000 {vp} True
write_memory 5497316 {size} 1 {value} 144 {vp} True
return 

:FGTAIM_820
write_memory 5497312 {size} 1 {value} 232 {vp} True
write_memory 5497313 {size} 4 {value} 2116363 {vp} True
return 

:FGTAIM_852
set_lvar_int_to_lvar_int 7@ = 27@
7@ += 4
7@ = read_memory 7@ {size} 4 {vp} False
if 
  7@ > 0
goto_if_false @FGTAIM_908
write_memory 27@ {size} 1 {value} 0 {vp} False

:FGTAIM_908
return 

:FGTAIM_910
25@ = 0
11@, 12@, 13@ = get_char_coordinates $PLAYER_ACTOR
24@ = get_ped_pointer $PLAYER_ACTOR
20@ = read_memory 12010640 {size} 4 {vp} False
set_lvar_int_to_lvar_int 21@ = 20@
21@ += 4
21@ = read_memory 21@ {size} 4 {vp} False
set_lvar_int_to_lvar_int 22@ = 20@
22@ += 8
22@ = read_memory 22@ {size} 4 {vp} False
20@ = read_memory 20@ {size} 4 {vp} False
23@ = 0

:FGTAIM_1026
if 
  is_int_lvar_greater_than_int_lvar 22@ > 23@
goto_if_false @FGTAIM_1355
set_lvar_int_to_lvar_int 26@ = 21@
add_int_lvar_to_int_lvar 26@ += 23@
26@ = read_memory 26@ {size} 1 {vp} False
if 
  26@ < 128
goto_if_false @FGTAIM_1341
set_lvar_int_to_lvar_int 26@ = 23@
26@ *= 1988
add_int_lvar_to_int_lvar 26@ += 20@
if 
  not is_int_lvar_equal_to_int_lvar 26@ == 24@
goto_if_false @FGTAIM_1341
set_lvar_int_to_lvar_int 27@ = 26@
27@ += 1328
27@ = read_memory 27@ {size} 4 {vp} False
if and
  27@ <> 54
  27@ <> 55
goto_if_false @FGTAIM_1341
set_lvar_int_to_lvar_int 27@ = 26@
27@ += 20
27@ = read_memory 27@ {size} 4 {vp} False
if 
  27@ <> 0
goto_if_false @FGTAIM_1341
27@ += 48
14@ = read_memory 27@ {size} 4 {vp} False
27@ += 4
15@ = read_memory 27@ {size} 4 {vp} False
27@ += 4
16@ = read_memory 27@ {size} 4 {vp} False
17@ = get_distance_between_coords_3d 11@ {fromY} 12@ {fromZ} 13@ {toX} 14@ {toY} 15@ {toZ} 16@
if 
  is_float_lvar_greater_or_equal_to_float_lvar 10@ >= 17@
goto_if_false @FGTAIM_1341
25@ = 1
return 

:FGTAIM_1341
23@ += 1
goto @FGTAIM_1026

:FGTAIM_1355
return 

:FGTAIM_1357
4@ = 0
5@ = 0
28@ = 0
7@ = read_memory 12216344 {size} 1 {vp} False
if 
  7@ == 0
goto_if_false @FGTAIM_1423
write_memory 11988014 {size} 1 {value} 1 {vp} False

:FGTAIM_1423
if 
  2@ >= 0
goto_if_false @FGTAIM_1471
write_memory 5497312 {size} 1 {value} 232 {vp} True
write_memory 5497313 {size} 4 {value} 2116363 {vp} True

:FGTAIM_1471
return 

:FGTAIM_1473
if 
  18@ == 1
goto_if_false @FGTAIM_1669
29@ = get_label_pointer @FGTAIM_2203
if 
  0@ == 1
goto_if_false @FGTAIM_1621
if 
  19@ == 1
goto_if_false @FGTAIM_1582
string_format 29@ {format} "~y~FIGHT AIM 0.2.0~w~ reloaded"
goto @FGTAIM_1662

:FGTAIM_1582
string_format 29@ {format} "~y~FIGHT AIM 0.2.0~w~ on"
goto @FGTAIM_1662

:FGTAIM_1621
string_format 29@ {format} "~y~FIGHT AIM 0.2.0~w~ off (AZ5=0)"

:FGTAIM_1662
gosub @FGTAIM_1671

:FGTAIM_1669
return 

:FGTAIM_1671
print_formatted_now "%s" {time} 3000 {args} 29@ 
return 

:FGTAIM_1686
0@ = 1
1@ = 121
18@ = 1
2@ = 1
3@ = 1
10@ = 5.0
if 
  7@ = read_int_from_ini_file "cleo\FightAim.ini" {section} "General" {key} "AZ5"
goto_if_false @FGTAIM_1788
set_lvar_int_to_lvar_int 0@ = 7@

:FGTAIM_1788
if 
  7@ = read_int_from_ini_file "cleo\FightAim.ini" {section} "General" {key} "ShowStatus"
goto_if_false @FGTAIM_1852
set_lvar_int_to_lvar_int 18@ = 7@

:FGTAIM_1852
if 
  7@ = read_int_from_ini_file "cleo\FightAim.ini" {section} "General" {key} "ReloadKey"
goto_if_false @FGTAIM_1915
set_lvar_int_to_lvar_int 1@ = 7@

:FGTAIM_1915
if 
  7@ = read_int_from_ini_file "cleo\FightAim.ini" {section} "FightAim" {key} "HideMarker"
goto_if_false @FGTAIM_1980
set_lvar_int_to_lvar_int 2@ = 7@

:FGTAIM_1980
if 
  7@ = read_int_from_ini_file "cleo\FightAim.ini" {section} "FightAim" {key} "HoldLock"
goto_if_false @FGTAIM_2043
set_lvar_int_to_lvar_int 3@ = 7@

:FGTAIM_2043
if 
  11@ = read_float_from_ini_file "cleo\FightAim.ini" {section} "FightAim" {key} "Radius"
goto_if_false @FGTAIM_2104
set_lvar_float_to_lvar_float 10@ = 11@

:FGTAIM_2104
7@ = read_memory 5497312 {size} 1 {vp} True
8@ = read_memory 5497313 {size} 4 {vp} True
if and
  7@ == 232
  8@ == 2116363
goto_if_false @FGTAIM_2163
return 

:FGTAIM_2163
if and
  7@ == 144
  8@ == -1869574000
goto_if_false @FGTAIM_2194
return 

:FGTAIM_2194
2@ = -1
return 

:FGTAIM_2203
hex
 00(128)
end
