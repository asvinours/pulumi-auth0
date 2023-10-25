// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Use this data source to access information about the tenant this provider is configured to access.
func LookupTenant(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*LookupTenantResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTenantResult
	err := ctx.Invoke("auth0:index/getTenant:getTenant", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getTenant.
type LookupTenantResult struct {
	// Whether to accept an organization name instead of an ID on auth endpoints.
	AllowOrganizationNameInAuthenticationApi bool `pulumi:"allowOrganizationNameInAuthenticationApi"`
	// URLs that Auth0 may redirect to after logout.
	AllowedLogoutUrls []string `pulumi:"allowedLogoutUrls"`
	// API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
	DefaultAudience string `pulumi:"defaultAudience"`
	// Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
	DefaultDirectory string `pulumi:"defaultDirectory"`
	// The default absolute redirection URI. Must be HTTPS or an empty string.
	DefaultRedirectionUri string `pulumi:"defaultRedirectionUri"`
	// Your Auth0 domain name.
	Domain string `pulumi:"domain"`
	// Supported locales for the user interface. The first locale in the list will be used to set the default locale.
	EnabledLocales []string `pulumi:"enabledLocales"`
	// Configuration settings for tenant flags.
	Flags []GetTenantFlag `pulumi:"flags"`
	// Friendly name for the tenant.
	FriendlyName string `pulumi:"friendlyName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Number of hours during which a session can be inactive before the user must log in again.
	IdleSessionLifetime float64 `pulumi:"idleSessionLifetime"`
	// The identifier value of the built-in Management API resource server, which can be used as an audience when configuring client grants.
	ManagementApiIdentifier string `pulumi:"managementApiIdentifier"`
	// URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
	PictureUrl string `pulumi:"pictureUrl"`
	// Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
	SandboxVersion string `pulumi:"sandboxVersion"`
	// Alters behavior of tenant's session cookie. Contains a single `mode` property.
	SessionCookies []GetTenantSessionCooky `pulumi:"sessionCookies"`
	// Number of hours during which a session will stay valid.
	SessionLifetime float64 `pulumi:"sessionLifetime"`
	// Sessions related settings for the tenant.
	Sessions []GetTenantSession `pulumi:"sessions"`
	// Support email address for authenticating users.
	SupportEmail string `pulumi:"supportEmail"`
	// Support URL for authenticating users.
	SupportUrl string `pulumi:"supportUrl"`
}

func LookupTenantOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) LookupTenantResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (LookupTenantResult, error) {
		r, err := LookupTenant(ctx, opts...)
		var s LookupTenantResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(LookupTenantResultOutput)
}

// A collection of values returned by getTenant.
type LookupTenantResultOutput struct{ *pulumi.OutputState }

func (LookupTenantResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTenantResult)(nil)).Elem()
}

func (o LookupTenantResultOutput) ToLookupTenantResultOutput() LookupTenantResultOutput {
	return o
}

func (o LookupTenantResultOutput) ToLookupTenantResultOutputWithContext(ctx context.Context) LookupTenantResultOutput {
	return o
}

func (o LookupTenantResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupTenantResult] {
	return pulumix.Output[LookupTenantResult]{
		OutputState: o.OutputState,
	}
}

// Whether to accept an organization name instead of an ID on auth endpoints.
func (o LookupTenantResultOutput) AllowOrganizationNameInAuthenticationApi() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupTenantResult) bool { return v.AllowOrganizationNameInAuthenticationApi }).(pulumi.BoolOutput)
}

// URLs that Auth0 may redirect to after logout.
func (o LookupTenantResultOutput) AllowedLogoutUrls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupTenantResult) []string { return v.AllowedLogoutUrls }).(pulumi.StringArrayOutput)
}

// API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
func (o LookupTenantResultOutput) DefaultAudience() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTenantResult) string { return v.DefaultAudience }).(pulumi.StringOutput)
}

// Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
func (o LookupTenantResultOutput) DefaultDirectory() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTenantResult) string { return v.DefaultDirectory }).(pulumi.StringOutput)
}

// The default absolute redirection URI. Must be HTTPS or an empty string.
func (o LookupTenantResultOutput) DefaultRedirectionUri() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTenantResult) string { return v.DefaultRedirectionUri }).(pulumi.StringOutput)
}

// Your Auth0 domain name.
func (o LookupTenantResultOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTenantResult) string { return v.Domain }).(pulumi.StringOutput)
}

// Supported locales for the user interface. The first locale in the list will be used to set the default locale.
func (o LookupTenantResultOutput) EnabledLocales() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupTenantResult) []string { return v.EnabledLocales }).(pulumi.StringArrayOutput)
}

// Configuration settings for tenant flags.
func (o LookupTenantResultOutput) Flags() GetTenantFlagArrayOutput {
	return o.ApplyT(func(v LookupTenantResult) []GetTenantFlag { return v.Flags }).(GetTenantFlagArrayOutput)
}

// Friendly name for the tenant.
func (o LookupTenantResultOutput) FriendlyName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTenantResult) string { return v.FriendlyName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupTenantResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTenantResult) string { return v.Id }).(pulumi.StringOutput)
}

// Number of hours during which a session can be inactive before the user must log in again.
func (o LookupTenantResultOutput) IdleSessionLifetime() pulumi.Float64Output {
	return o.ApplyT(func(v LookupTenantResult) float64 { return v.IdleSessionLifetime }).(pulumi.Float64Output)
}

// The identifier value of the built-in Management API resource server, which can be used as an audience when configuring client grants.
func (o LookupTenantResultOutput) ManagementApiIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTenantResult) string { return v.ManagementApiIdentifier }).(pulumi.StringOutput)
}

// URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
func (o LookupTenantResultOutput) PictureUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTenantResult) string { return v.PictureUrl }).(pulumi.StringOutput)
}

// Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
func (o LookupTenantResultOutput) SandboxVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTenantResult) string { return v.SandboxVersion }).(pulumi.StringOutput)
}

// Alters behavior of tenant's session cookie. Contains a single `mode` property.
func (o LookupTenantResultOutput) SessionCookies() GetTenantSessionCookyArrayOutput {
	return o.ApplyT(func(v LookupTenantResult) []GetTenantSessionCooky { return v.SessionCookies }).(GetTenantSessionCookyArrayOutput)
}

// Number of hours during which a session will stay valid.
func (o LookupTenantResultOutput) SessionLifetime() pulumi.Float64Output {
	return o.ApplyT(func(v LookupTenantResult) float64 { return v.SessionLifetime }).(pulumi.Float64Output)
}

// Sessions related settings for the tenant.
func (o LookupTenantResultOutput) Sessions() GetTenantSessionArrayOutput {
	return o.ApplyT(func(v LookupTenantResult) []GetTenantSession { return v.Sessions }).(GetTenantSessionArrayOutput)
}

// Support email address for authenticating users.
func (o LookupTenantResultOutput) SupportEmail() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTenantResult) string { return v.SupportEmail }).(pulumi.StringOutput)
}

// Support URL for authenticating users.
func (o LookupTenantResultOutput) SupportUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTenantResult) string { return v.SupportUrl }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTenantResultOutput{})
}
