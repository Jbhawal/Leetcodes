@REM @echo off
@REM cd /d/JB/Leetcodes

@REM REM Get the current date in YYYY-MM-DD format
@REM for /f "tokens=1-3 delims=/" %%a in ('date /t') do (
@REM     set "MM=%%a"
@REM     set "DD=%%b"
@REM     set "YYYY=%%c"
@REM )
@REM set "today=%YYYY%-%MM%-%DD%"

@REM git add .
@REM git commit -m "Update Leetcode solution on %today%"
@REM git push origin main

@REM echo LeetCode solutions pushed to GitHub successfully!
@REM pause


@echo off
cd /d D:\JB\Leetcodes

REM Extract date in YYYY-MM-DD format using WMIC (works consistently)
for /f %%i in ('wmic os get localdatetime ^| find "."') do set datetime=%%i
set today=%datetime:~0,4%-%datetime:~4,2%-%datetime:~6,2%

git add .
git commit -m "Updated Leetcode solution on %today%"
git pull origin main --rebase
git push origin main

echo LeetCode solutions pushed to GitHub successfully!
pause
