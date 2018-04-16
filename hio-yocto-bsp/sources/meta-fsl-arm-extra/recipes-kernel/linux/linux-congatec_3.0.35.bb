# Copyright (C) 2011-2013 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel based on Freescale Linux kernel to add support for Congatec boards"
include recipes-kernel/linux/linux-imx.inc

# Revision of 4.1.0 branch
SRCREV = "bdde708ebfde4a8c1d3829578d3f6481a343533a"
LOCALVERSION = "-4.1.0+yocto"
SRCBRANCH = "imx_3.0.35_4.1.0"

# Patches need for Yocto and not applied by Freescale when doing 4.1.0 branch
SRC_URI += "file://drm-vivante-Add-00-sufix-in-returned-bus-Id.patch \
            file://epdc-Rename-mxcfb_epdc_kernel.h-to-mxc_epdc.h.patch \
            file://0001-perf-tools-Fix-getrusage-related-build-failure-on-gl.patch \
            file://0002-ARM-7668-1-fix-memset-related-crashes-caused-by-rece.patch \
            file://0003-ARM-7670-1-fix-the-memset-fix.patch \
            file://0004-ENGR00271136-Fix-build-break-when-CONFIG_CLK_DEBUG-i.patch \
            file://0005-ENGR00271359-Add-Multi-touch-support.patch \
            file://0006-Add-support-for-DVI-monitors.patch \
            file://0001-Add-linux-support-for-congatec-evaluation-board-qmx6q.patch \
            file://ENGR00278350-gpu-viante-4.6.9p13-kernel-part-integra.patch \
"

COMPATIBLE_MACHINE = "(cgtqmx6)"
