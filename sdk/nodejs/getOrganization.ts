// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source to retrieve a specific Auth0 organization by `organizationId` or `name`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const some-organization-by-name = auth0.getOrganization({
 *     name: "my-org",
 * });
 * const some-organization-by-id = auth0.getOrganization({
 *     organizationId: "org_abcdefghkijklmnopqrstuvwxyz0123456789",
 * });
 * ```
 */
export function getOrganization(args?: GetOrganizationArgs, opts?: pulumi.InvokeOptions): Promise<GetOrganizationResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getOrganization:getOrganization", {
        "name": args.name,
        "organizationId": args.organizationId,
    }, opts);
}

/**
 * A collection of arguments for invoking getOrganization.
 */
export interface GetOrganizationArgs {
    /**
     * The name of the organization. If not provided, `organizationId` must be set. For performance, it is advised to use the `organizationId` as a lookup if possible.
     */
    name?: string;
    /**
     * The ID of the organization. If not provided, `name` must be set.
     */
    organizationId?: string;
}

/**
 * A collection of values returned by getOrganization.
 */
export interface GetOrganizationResult {
    /**
     * Defines how to style the login pages.
     */
    readonly brandings: outputs.GetOrganizationBranding[];
    readonly connections: outputs.GetOrganizationConnection[];
    /**
     * Friendly name of this organization.
     */
    readonly displayName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Metadata associated with the organization. Maximum of 10 metadata properties allowed.
     */
    readonly metadata: {[key: string]: string};
    /**
     * The name of the organization. If not provided, `organizationId` must be set. For performance, it is advised to use the `organizationId` as a lookup if possible.
     */
    readonly name?: string;
    /**
     * The ID of the organization. If not provided, `name` must be set.
     */
    readonly organizationId?: string;
}
/**
 * Data source to retrieve a specific Auth0 organization by `organizationId` or `name`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const some-organization-by-name = auth0.getOrganization({
 *     name: "my-org",
 * });
 * const some-organization-by-id = auth0.getOrganization({
 *     organizationId: "org_abcdefghkijklmnopqrstuvwxyz0123456789",
 * });
 * ```
 */
export function getOrganizationOutput(args?: GetOrganizationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetOrganizationResult> {
    return pulumi.output(args).apply((a: any) => getOrganization(a, opts))
}

/**
 * A collection of arguments for invoking getOrganization.
 */
export interface GetOrganizationOutputArgs {
    /**
     * The name of the organization. If not provided, `organizationId` must be set. For performance, it is advised to use the `organizationId` as a lookup if possible.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the organization. If not provided, `name` must be set.
     */
    organizationId?: pulumi.Input<string>;
}
