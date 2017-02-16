#converts png to jpg
#adds metadata

import json
import pyexiv2
import PIL.Image
import os

for imageName in os.listdir('.'):
	if imageName.endswith(".jpg") or imageName.endswith(".png") \
	or imageName.endswith(".jpeg") or imageName.endswith(".JPEG") or imageName.endswith(".JPG"):
		if imageName.endswith(".png"):
			img = PIL.Image.open(imageName) 
			newName = imageName[0:-4] + ".jpg"
			img.save(newName, "JPEG") #save as a new jpg
			os.remove(imageName) #delete png file
			imageName = newName #make the .jpg filename the new filename
			print "new image name (should be jpg): " + imageName
		metadata = pyexiv2.ImageMetadata(imageName)
		metadata.read()
		jsonComment = {'species':'not dog'}
		metadata['Exif.Photo.UserComment'] = json.dumps(jsonComment)
		metadata.write()

		# metadata = pyexiv2.ImageMetadata(imageName)
		# metadata.read()
		jsonComment = json.loads(metadata['Exif.Photo.UserComment'].value)
		print str(jsonComment) + "   " + imageName

	else:
		print "unknown filetype: " + imageName
