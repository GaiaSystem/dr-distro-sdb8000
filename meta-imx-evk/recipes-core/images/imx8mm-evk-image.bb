DESCRIPTION = "Reference image"

require recipes-bsp/images/datarespons-image.bb

FEATURE_PACKAGES_imx-evk-apps = "\
	packagegroup-imx-evk-base \
"

IMAGE_FEATURES += "imx-evk-apps"
IMAGE_INSTALL_append += " kernel-image-fitimage"
