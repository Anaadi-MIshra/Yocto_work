# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
#LICENSE = "CLOSED"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM ="file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

#SRC_URI = "file:///home/anaadi/YOCTO_PROJ/meta-mine/recipes-autotools/hello_auto/hello_auto.tar.gz"
SRC_URI += "git://github.com/Anaadi-MIshra/Yocto_work.git;protocol=https"
#SRC_URI += "file://Makefile.am"
SRC_URI[md5sum] ="c2c87c0392bc0e627ea22b2012bfbee1"

SRCREV="${AUTOREV}"
SRCREV_machine="${AUTOREV}"

#SRCREV = "release-1.0"

#SRC_URI[sha256sum] = "c67e3efda959ba9cdc5fa926bce9f363ec93fba52725506402ad16b2d54f550c"
#/home/anaadi/YOCTO_PROJ/meta-mine/recipes-autotools/hello_auto/configure.ac"
#SRC_URI += "file://configure.ac"
#/home/anaadi/YOCTO_PROJ/meta-mine/recipes-autotools/hello_auto/Makefile.am"

#/home/anaadi/build/tmp/work/i586-poky-linux/helloauto/1.0-r0/git/YOCTO_PROJ/meta-mine/recipes-autotools/hello_auto
S = "${WORKDIR}/git"

# NOTE: no Makefile found, unable to determine what needs to be done

do_configure () {
	# Specify any needed configure commands here
	pwd
}

do_compile () {
	# Specify compilation commands here
	pwd
	ls
	aclocal
	ls
	autoconf
	ls
	automake --add-missing --foreign
	ls
	./configure
	
	make
}

do_install () {
	# Specify install commands here
 	install -d ${D}${bindir}
	install -m 0755 hello_autotool ${D}${bindir}	
}

