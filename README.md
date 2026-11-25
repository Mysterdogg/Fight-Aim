# Fight Aim by Mysterdogg

A small CLEO script that enables melee lock-on for **Mouse + Keys** players, inspired by GTA IV. With a melee weapon *(or unarmed)*, hold the aim button *(right mouse button)* near a ped: CJ locks onto the ped with the game's own joypad targeting and the camera follows the fight. Release the button and the mouse free aim comes back.

## Requirements

- GTA San Andreas US 1.0
- CLEO 4.4.4

## Install

1. Copy `FightAim.cs` and `FightAim.ini` into the game's `CLEO` folder.

## Configuration (`FightAim.ini`)

| Key | Default Value | Settings |
|---|---|---|
| `[General] AZ5` | 1 | Master switch. `Enabled` by default, use `0` to disable it.|
| `[General] ShowStatus` | 0 | Short status text when the game starts and when this file is reloaded. `Disabled` by default, use `1` to enable it. |
| `[General] ReloadKey` | 121 (F10) | Key for relaoding the INI in-game. `F10` *(121)* by default. Uses Windows virtual-key codes, in DECIMAL. Set key to `0` to disable it.|
| `[FightAim] Radius` | 5.0 | How close a ped must be to start the lock, in meters. `5.0` by default. |
| `[FightAim] HoldLock` | 1 | `1` = Stay locked while the button is held, even if the ped dies or walks away. `0` = drop the lock as soon as no ped is within `Radius`. |
| `[FightAim] HideMarker` | 1 | `0` = vanilla. `1` = shown while locked without the fade out when the lock ends. `2` = disables the lock-on marker entirely. |

## How it works

The game has two ways of aiming on foot, mouse free aim and joypad lock-on. The game menu sets it from its Controller option. While the conditions hold, the script sets it to 0, and back to 1 when they end.

The lock stays while the button is held (`HoldLock`), so it does not drop the moment the ped dies.

Melee is told by the weapon's fire type, not by IDs, so weapons added by limit adjusters work; guns, projectiles, explosives and the rest are ignored by the script.

## Changelog

- **1.0.0** (2026-11-25): First public version.
