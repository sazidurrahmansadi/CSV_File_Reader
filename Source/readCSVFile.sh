#!/bin/bash

echo "Air quality search by......:  "
echo "1 = Startion"
echo "2 = Air Quality"
echo "3 = Longitude"
echo "4 = Latitude"
echo "5 = Date and Time"
echo " "
read -p "Enter your choice: " choice


if [ $choice -eq 1 ]
then
    read -p "Enter the Station name: " key
    echo " "
    grep -w "$key" air_quality_Nov2017.csv | csvcut -c 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15

elif [ $choice -eq 2 ]
then
	read -p "Enter air quality: " key
	echo " "
	grep -w "$key" air_quality_Nov2017.csv | csvcut -c 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15

elif [ $choice -eq 3 ]
then
	read -p "Enter Longitude: " key
	echo " "
	grep -w "$key" air_quality_Nov2017.csv | csvcut -c 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15

elif [ $choice -eq 4 ]
then
	read -p "Enter Latitude: " key
	echo " "
	grep -w "$key" air_quality_Nov2017.csv | csvcut -c 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15

elif [ $choice -eq 5 ]
then
	read -p "Enter Date and Time: " key
	echo " "
	grep -w "$key" air_quality_Nov2017.csv | csvcut -c 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15


else
    echo "Data not found"
fi
