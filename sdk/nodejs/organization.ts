// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * The Organizations feature represents a broad update to the Auth0 platform that allows our business-to-business (B2B) customers to better manage their partners and customers, and to customize the ways that end-users access their applications. Auth0 customers can use Organizations to:
 *
 *   - Represent their business customers and partners in Auth0 and manage their
 *     membership.
 *   - Configure branded, federated login flows for each business.
 *   - Build administration capabilities into their products, using Organizations
 *     APIs, so that those businesses can manage their own organizations.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myOrganization = new auth0.Organization("myOrganization", {
 *     branding: {
 *         colors: {
 *             pageBackground: "#e1e1e1",
 *             primary: "#f2f2f2",
 *         },
 *         logoUrl: "https://example.com/assets/icons/icon.png",
 *     },
 *     displayName: "Auth0 Inc.",
 * });
 * ```
 *
 * ## Import
 *
 * Existing organizations can be imported using the organization ID. # Example
 *
 * ```sh
 *  $ pulumi import auth0:index/organization:Organization my_organization org_XXXXXXXXXXXXXX
 * ```
 */
export class Organization extends pulumi.CustomResource {
    /**
     * Get an existing Organization resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationState, opts?: pulumi.CustomResourceOptions): Organization {
        return new Organization(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/organization:Organization';

    /**
     * Returns true if the given object is an instance of Organization.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Organization {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Organization.__pulumiType;
    }

    /**
     * Defines how to style the login pages.
     */
    public readonly branding!: pulumi.Output<outputs.OrganizationBranding>;
    /**
     * Friendly name of this organization.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * Metadata associated with the organization. Maximum of 10 metadata properties allowed.
     */
    public readonly metadata!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The name of this organization.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a Organization resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: OrganizationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrganizationArgs | OrganizationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrganizationState | undefined;
            resourceInputs["branding"] = state ? state.branding : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["metadata"] = state ? state.metadata : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as OrganizationArgs | undefined;
            resourceInputs["branding"] = args ? args.branding : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["metadata"] = args ? args.metadata : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Organization.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Organization resources.
 */
export interface OrganizationState {
    /**
     * Defines how to style the login pages.
     */
    branding?: pulumi.Input<inputs.OrganizationBranding>;
    /**
     * Friendly name of this organization.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Metadata associated with the organization. Maximum of 10 metadata properties allowed.
     */
    metadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of this organization.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Organization resource.
 */
export interface OrganizationArgs {
    /**
     * Defines how to style the login pages.
     */
    branding?: pulumi.Input<inputs.OrganizationBranding>;
    /**
     * Friendly name of this organization.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Metadata associated with the organization. Maximum of 10 metadata properties allowed.
     */
    metadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of this organization.
     */
    name?: pulumi.Input<string>;
}
