import matplotlib.pyplot as plt
import PIL.Image
import json
import pyexiv2

from PIL.ExifTags import TAGS

from skimage.feature import hog
from skimage import data, color, exposure
from skimage import io

metadata = pyexiv2.ImageMetadata('img/tyggz.jpg')
metadata.read()
data = json.loads(metadata['Exif.Photo.UserComment'].value)

# data = json.loads(raw['Exif.Photo'].value)

# data =  PIL.Image.open('img/tyggz.jpg')._getexif()
# for (k,v) in data.iteritems():
#         print '%s = %s' % (TAGS.get(k), v)
# data =  PIL.Image.open('img/tyggz.jpg').info
print data
cat = color.rgb2gray(io.imread("img/tyggz.jpg"))

# image = color.rgb2gray(data.astronaut())

fd, hog_image = hog(cat, orientations=8, pixels_per_cell=(16, 16),
                    cells_per_block=(1, 1), visualise=True)

fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(8, 4), sharex=True, sharey=True)

ax1.axis('off')
ax1.imshow(cat, cmap=plt.cm.gray)
ax1.set_title('Input image')
ax1.set_adjustable('box-forced')

# Rescale histogram for better display
hog_image_rescaled = exposure.rescale_intensity(hog_image, in_range=(0, 0.02))

ax2.axis('off')
ax2.imshow(hog_image_rescaled, cmap=plt.cm.gray)
ax2.set_title('Histogram of Oriented Gradients')
ax1.set_adjustable('box-forced')
plt.show()