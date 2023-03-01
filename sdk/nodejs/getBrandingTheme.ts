// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to access information about the tenant's branding theme settings.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myBrandingTheme = auth0.getBrandingTheme({});
 * ```
 */
export function getBrandingTheme(opts?: pulumi.InvokeOptions): Promise<GetBrandingThemeResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getBrandingTheme:getBrandingTheme", {
    }, opts);
}

/**
 * A collection of values returned by getBrandingTheme.
 */
export interface GetBrandingThemeResult {
    readonly borders: outputs.GetBrandingThemeBorder[];
    readonly colors: outputs.GetBrandingThemeColor[];
    /**
     * The display name for the branding theme.
     */
    readonly displayName: string;
    readonly fonts: outputs.GetBrandingThemeFont[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly pageBackgrounds: outputs.GetBrandingThemePageBackground[];
    readonly widgets: outputs.GetBrandingThemeWidget[];
}
